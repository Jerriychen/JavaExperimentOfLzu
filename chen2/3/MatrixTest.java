class Matrix {
int row;
int col;
float x[][];


Matrix(int a,int b) {
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
	if(a<row&&b<col) return x[a][b];
	else
		{System.out.println("xiabiaoyuejie");return 0;}
}

public void setData(int a,int b,float c) {
	if(a<row&&b<col){
		x[a][b]=c;
	}
	else {
		 System.out.println("xiabiaoyuejie");}
}


public boolean equals(Matrix matrix) {
if(row==matrix.getRow()&&col==matrix.getCol()) {
	for(int i=0;i<matrix.x.length;i++) {
		for(int j=0;j<matrix.x[i].length;j++) {
			if(x[i][j]!=matrix.x[i][j]) { return false; }
		}
	}
	return true;
   }
return false;
}

public Matrix add(Matrix matrix) {
		Matrix temp=null;
        if(this.getRow()==matrix.getRow()&&this.getCol()==matrix.getCol()) {
					temp=new Matrix(this.getRow(),this.getCol());
					float[][] a=new float[this.getRow()][this.getCol()];
					float[][] b=this.getX();
					float[][] c=matrix.getX();
            for(int i=0; i<b.length; i++) {
                for(int j=0; j<b[0].length; j++) {
                    a[i][j] = b[i][j] + c[i][j];
                }
            }
					temp.setX(a);
        }
        return temp;
}



public String toString() {
		String a="";
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				a+=x[i][j]+" ";
			}
			a+="\n";
		}
		return a;
}
}


public class MatrixTest {

public static void main(String[] args) {
	Matrix matrix1=new Matrix(2,2);
	Matrix matrix2=new Matrix(2,2);
	float[][] a=new float[2][2];
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
			a[i][j]=(float)(i+j);
		}
	}
	matrix1.setX(a);
	matrix2.setX(a);
	Matrix result=matrix1.add(matrix2);
	System.out.println("matrix1=");
	System.out.println(matrix1);
	System.out.println("matrix2=");
	System.out.println(matrix2);
	System.out.println("matrix1+matrix2=");
	System.out.println(result);
	System.out.println("matrix1.equals(matrix2)="+matrix1.equals(matrix2));
}
}
