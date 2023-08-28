package com.rookie.common.core.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.List;
import lombok.Data;

/**
 * @author yayee
 */
@Data
public class PageDTO<T> {

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 列表数据
     */
    private List<T> rows;

    public PageDTO(Long count, List<T> list) {
        this.total = count;
        this.rows = list;
    }

    public PageDTO(List<T> list) {
        this.rows = list;
        this.total = (long) list.size();
    }

    public PageDTO(Page<T> page) {
        this.rows = page.getRecords();
        this.total = page.getTotal();
    }
}
