package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        // 자동 형변환 : float f =I(float)i; => 작은타입 => 큰 타입에 대입 시 가능
        float f = 1;
        int i2 = (int) f;

        double d = 1; // 자동 형변환
        int i3 = (int) d;
        // 형변환 가능 기본타입
        // byte,shortint,long,float,double > 자동
        // byte,shortint,long,float,double < 변환
        // char
    }
}
