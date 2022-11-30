package com.example.ktso3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ktso3.NhaVan;
import com.example.ktso3.NhavanAdapter;
import com.example.ktso3.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv_nhavan;
    private NhavanAdapter nhavanAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_nhavan =  findViewById(R.id.rcv_Nhavan);
        nhavanAdapter = new NhavanAdapter(getListCategory(),this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcv_nhavan.setLayoutManager(linearLayoutManager);
        rcv_nhavan.setAdapter(nhavanAdapter);
    }
    @NonNull
    private List<NhaVan> getListCategory() {
        List<NhaVan> congAnList=new ArrayList<>();
        congAnList.add(new NhaVan("Huy Cận ", "Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông (nay là Bộ Nông nghiệp và Phát triển nông thôn), Thứ trưởng Bộ Văn hóa Nghệ thuật, Bộ trưởng Bộ Văn hóa Giáo dục, Thứ trưởng Bộ Nội vụ, Bộ Kinh tế, Bộ trưởng Tổng Thư ký Hội đồng Bộ trưởng (nay là Bộ trưởng Chủ nhiệm Văn phòng Chính phủ), ngoài ra ông còn là một nhà lãnh đạo chủ chốt của Đảng Dân chủ Việt Nam, đảng viên Đảng Cộng sản Việt Nam[1][2], đồng thời cũng là một trong những thi sĩ xuất sắc nhất của phong trào Thơ mới. Ông từng là Viện sĩ Viện Hàn lâm Thơ Thế giới và Chủ tịch Ủy ban Liên hiệp các Hiệp hội Văn học Việt Nam giai đoạn 1984-1995.","4",R.drawable.huycan));
        congAnList.add(new NhaVan("Mạc Ngôn ", "Mạc Ngôn là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến với tác phẩm Cao lương đỏ đã được đạo diễn nổi tiếng Trương Nghệ Mưu chuyển thể thành phim. Bộ phim đã được giải Gấu vàng tại Liên hoan phim quốc tế Berlin năm 1988.","5",R.drawable.macngon));
        congAnList.add(new NhaVan("Shakespeare ", "William Shakespeare là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh và là nhà viết kịch đi trước thời đại. Ông còn được vinh danh là nhà thơ tiêu biểu của nước Anh và là 'Thi sĩ của dòng sông Avon'","4",R.drawable.shakespeare));
        congAnList.add(new NhaVan("hemingway ", "Ernest Miller Hemingway là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo. Ông là một phần của cộng đồng những người xa xứ ở Paris trong thập niên 20 của thế kỷ XX và là một trong những cựu quân nhân trong Chiến tranh thế giới I, sau đó được biết đến qua 'Thế hệ đã mất'","3",R.drawable.hemingway));
        congAnList.add(new NhaVan("Hàn Mạc Tử ", "Hàn Mặc Tử hay Hàn Mạc Tử là một nhà thơ người Việt Nam, người khởi xướng ra Trường thơ Loạn và cũng là người tiên phong của dòng thơ lãng mạn hiện đại Việt Nam. Hàn Mặc Tử cùng với Quách Tấn, Yến Lan, Chế Lan Viên được người đương thời ở Bình Định gọi là Bàn thành tứ hữu, nghĩa là Bốn người bạn ở thành Đồ Bàn","5",R.drawable.hanmactu));
        congAnList.add(new NhaVan("Tô Hoài ", "Tô Hoài là một nhà văn Việt Nam. Một số tác phẩm đề tài thiếu nhi của ông được dịch ra ngoại ngữ.","8",R.drawable.huycan));



        return congAnList;
    }
}