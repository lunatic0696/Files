package br.edu.ifpi.ads;

public class ALU {

	private boolean[] operand1;
	private boolean[] operand2;

	private Boolean branchTaken;

	public boolean[] execute(OperationCode opCode) {
		boolean[] result = new boolean[16];
		short op1;
		short op2;
		switch(opCode) {
		case ADD:
			op1 = convertBitToDecimal(operand1);
			System.out.println("op1: " + op1);
			op2 = convertBitToDecimal(operand2);
			System.out.println("op2: "+ op2);
			short sum = (short) (op1 + op2);
			result = convertDecimalToBit(sum);
			System.out.println("Resultado: " + result);
			return result;
		case PASS1:
			return operand1;
		default:
			return null;
		}
		
	}
	
	public short convertBitToDecimal(boolean[] bit){
		short result = 0;
		int pos = bit.length-1;
		for (boolean b : bit) {
			if (b == true) {
				result += Math.pow(2, pos);
				pos--;
			}
		}		
		return result;
	}
	
	public boolean[] convertDecimalToBit(short num){
		boolean[] result = new boolean[16];
		for (int i = 15; i > -1; i--) {
			short q = (short) (num/2);
			if(num%2 == 0){
				result[i] = false;
			}else{
				result[i] = true;
			}
			num = q;
		}
		return result;
	}

	public boolean[] getOperand1() {
		return operand1;
	}

	public void setOperand1(boolean[] operand1) {
		this.operand1 = operand1;
	}

	public boolean[] getOperand2() {
		return operand2;
	}

	public void setOperand2(boolean[] operand2) {
		this.operand2 = operand2;
	}

	public boolean isBranchTaken() {
		return branchTaken;
	}
	
}

