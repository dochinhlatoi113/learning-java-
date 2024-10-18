// chuyễn đổi,ép kiểu dữ liệu
public class ConvertDataType {
    public static void main(String[] args) {
        // ép kiểu mặc định :
           // + 2 kiểu dữ liệu phải tương thích
           // + kiểu đích phải lớn hơn kiểu nguồn vd : từ INT (5)=> FLOAT (5.3)
        // ép kiểu tường minh :
          // + khi cần chuyển sang kiểu dữ liệu có độ chính xác cao hơn vd từ FLOAT => INT 
        
        // ép kiểu tường minh
        int a = 100;
        System.err.println(a);
        float b = a;
        System.err.println(b);

        // ép kiểu ngầm định
        float c = 3.5f;
        System.err.println(c);
        int d = (int) c;
        System.err.println(d);


    }
}
