class Static_final {

static int i=10;
static final int k=20;
static {
i=i+5;
}

public static void main(String[] args) {

System.out.println("i="+i);
System.out.println("k="+k);
}

static{i=i/2;}

} 