package shiyan1_7;

public class Matrix {
	private int row;
	private int col;
	private float x[][];

	public Matrix(int a,int b) {
		if(a>0) row=a;
			else row=0;
		if(b>0) col=b;
			else col=0;
		x=new float[a][b];
	}

	public void setX(float[][] x1) {
		for(int i=0;i<x1.length;i++) {
			for(int j=0;j<x1[i].length;j++) {
				x[i][j]=x1[i][j];
			}
		}
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public float[][] getX() {
		return x;
	}

	public float getData(int a,int b){
		if(a<row&&b<col) 
			return x[a][b];
		else	{
				System.out.println("数组越界");return 0;
			}
	}

	public void setData(int a,int b,float c) {
		if(a<row&&b<col){
			x[a][b]=c;
		}
		else {
			 System.out.println("数组越界");}
	}

	public Matrix add(Matrix matrix) {
			Matrix temp = null;
	        if(this.row == matrix.getRow()&&this.col == matrix.getCol()) {
					temp = new Matrix(this.row,this.col);
					float[][] a = new float[this.row][this.col];
					float[][] c = matrix.getX();
					
		            for(int i=0; i<x.length; i++) {
		                for(int j=0; j<x[0].length; j++) {
		                    a[i][j] = x[i][j] + c[i][j];
		                }
		            }
					temp.setX(a);
	        }
	        else{
	        	System.out.println("两矩阵的行列数不相等!");
	        }
	        return temp;
	}
	
	public Matrix sub(Matrix matrix){
		Matrix temp = null;
        if(this.row == matrix.getRow() && this.col == matrix.getCol()) {
				temp = new Matrix(this.row,this.col);
				float[][] a = new float[this.row][this.col];
				float[][] c = matrix.getX();
				
	            for(int i = 0 ; i < x.length ; i ++ ) {
	                for(int j = 0 ; j < x[0].length ; j ++) {
	                    a[i][j] = x[i][j] - c[i][j];
	                }
	            }
				temp.setX(a);
        }
        else{
        	System.out.println("两矩阵的行列数不相等!");
        }
        return temp;
	}
	
	public Matrix mul(Matrix matrix){
		Matrix temp=null;
        if(this.col==matrix.getRow()) {
			temp=new Matrix(this.row,matrix.getCol());
			float[][] a=new float[this.row][matrix.getCol()];
			float[][] c=matrix.getX();
			
            for(int i=0; i<a.length; i++) {
                for(int j=0; j<a[0].length; j++) {
                    a[i][j]=0;
                    for(int k=0;k<this.col;k++){
                    	a[i][j]+=x[i][k]*c[k][j];
                    }
                }
            }
			temp.setX(a);
        }
        else{
        	System.out.println("两矩阵的行列数不符合要求!");
        }
        return temp;
	}
	
	public String toString() {
		String a="";
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				a+=x[i][j]+"\t";
			}
			a+="\n";
		}
		return a;
	}
	
}


