package com.wghcwc.retrofitrxjava;


import java.util.List;

/**
 * Created by zy on 2019/3/14.
 */
public class HomeRec {

    /**
     * code : 200
     * message : ok
     * attachData : [{"banner_img":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/other/home/20190228143852439868.png","redirect_url":"http://13loveme.com/home/contact"},{"banner_img":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/other/home/20190228141207644928.png","redirect_url":"http://13loveme.com"}]
     * data : [{"user_id":76603,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219162556778006.png","nickname":"tqlmm2","authInfo":{"id_auth":"1","edu_auth":"0","house_auth":"1","car_auth":"0"},"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76605,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219164957389461.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76608,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219165812639698.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76609,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219165931229476.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76610,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219170118340565.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76611,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219170428563550.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76612,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/155056773148826362.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76613,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/15505678044916007146.png","nickname":"tqlmm","authInfo":null,"address":"北京","age":29,"height":175,"yearly_salary":"5w-10w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76631,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/155202871688869085.png","nickname":"ggg","authInfo":null,"address":"苏州","age":24,"height":170,"yearly_salary":"30w-50w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":0},{"user_id":76634,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/155244419783485909.jpg","nickname":"你好👋","authInfo":null,"address":"苏州","age":20,"height":153,"yearly_salary":"10w-15w","introduce":"","zodiac":"双鱼座","vip":0,"is_like":0},{"user_id":76635,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/155244658811942830.jpg","nickname":"dvhhj","authInfo":null,"address":"南宁","age":19,"height":147,"yearly_salary":"5w或以内","introduce":"","zodiac":"双鱼座","vip":0,"is_like":0},{"user_id":76636,"avatar":"https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/155245833457917761.jpg","nickname":"啦咯啦咯啦咯啦","authInfo":null,"address":"银川","age":27,"height":183,"yearly_salary":"15w-20w","introduce":"","zodiac":"摩羯座","vip":0,"is_like":1}]
     * _links : {"self":{"href":"https://app.51uniu.com/v1/home-view-lists?page=1"}}
     * _meta : {"totalCount":12,"pageCount":1,"currentPage":1,"perPage":20}
     */

    private LinksBean _links;
    private MetaBean _meta;
    private List<AttachDataBean> attachData;
    private List<DataBean> data;

    public LinksBean get_links() {
        return _links;
    }

    public void set_links(LinksBean _links) {
        this._links = _links;
    }

    public MetaBean get_meta() {
        return _meta;
    }

    public void set_meta(MetaBean _meta) {
        this._meta = _meta;
    }

    public List<AttachDataBean> getAttachData() {
        return attachData;
    }

    public void setAttachData(List<AttachDataBean> attachData) {
        this.attachData = attachData;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class LinksBean {
        /**
         * self : {"href":"https://app.51uniu.com/v1/home-view-lists?page=1"}
         */

        private SelfBean self;

        public SelfBean getSelf() {
            return self;
        }

        public void setSelf(SelfBean self) {
            this.self = self;
        }

        public static class SelfBean {
            /**
             * href : https://app.51uniu.com/v1/home-view-lists?page=1
             */

            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }
    }

    public static class MetaBean {
        /**
         * totalCount : 12
         * pageCount : 1
         * currentPage : 1
         * perPage : 20
         */

        private int totalCount;
        private int pageCount;
        private int currentPage;
        private int perPage;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getPerPage() {
            return perPage;
        }

        public void setPerPage(int perPage) {
            this.perPage = perPage;
        }
    }

    public static class AttachDataBean  {
        /**
         * banner_img : https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/other/home/20190228143852439868.png
         * redirect_url : http://13loveme.com/home/contact
         */

        private String banner_img;
        private String redirect_url;

        public String getBanner_img() {
            return banner_img;
        }

        public void setBanner_img(String banner_img) {
            this.banner_img = banner_img;
        }

        public String getRedirect_url() {
            return redirect_url;
        }

        public void setRedirect_url(String redirect_url) {
            this.redirect_url = redirect_url;
        }


    }

    public static class DataBean {
        /**
         * user_id : 76603
         * avatar : https://zxhlapp.oss-cn-hangzhou.aliyuncs.com/user_attach/avatar/20190219162556778006.png
         * nickname : tqlmm2
         * authInfo : {"id_auth":"1","edu_auth":"0","house_auth":"1","car_auth":"0"}
         * address : 北京
         * age : 29
         * height : 175
         * yearly_salary : 5w-10w
         * introduce :
         * zodiac : 摩羯座
         * vip : 0
         * is_like : 0
         */

        private int user_id;
        private String avatar;
        private String nickname;
        private AuthInfoBean authInfo;
        private String address;
        private int age;
        private int height;
        private String yearly_salary;
        private String introduce;
        private String zodiac;
        private int vip;
        private int is_like;

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public AuthInfoBean getAuthInfo() {
            return authInfo;
        }

        public void setAuthInfo(AuthInfoBean authInfo) {
            this.authInfo = authInfo;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getYearly_salary() {
            return yearly_salary;
        }

        public void setYearly_salary(String yearly_salary) {
            this.yearly_salary = yearly_salary;
        }

        public String getIntroduce() {
            return introduce;
        }

        public void setIntroduce(String introduce) {
            this.introduce = introduce;
        }

        public String getZodiac() {
            return zodiac;
        }

        public void setZodiac(String zodiac) {
            this.zodiac = zodiac;
        }

        public int getVip() {
            return vip;
        }

        public void setVip(int vip) {
            this.vip = vip;
        }

        public int getIs_like() {
            return is_like;
        }

        public void setIs_like(int is_like) {
            this.is_like = is_like;
        }

        public static class AuthInfoBean {
            /**
             * id_auth : 1
             * edu_auth : 0
             * house_auth : 1
             * car_auth : 0
             */

            private String id_auth;
            private String edu_auth;
            private String house_auth;
            private String car_auth;

            public String getId_auth() {
                return id_auth;
            }

            public void setId_auth(String id_auth) {
                this.id_auth = id_auth;
            }

            public String getEdu_auth() {
                return edu_auth;
            }

            public void setEdu_auth(String edu_auth) {
                this.edu_auth = edu_auth;
            }

            public String getHouse_auth() {
                return house_auth;
            }

            public void setHouse_auth(String house_auth) {
                this.house_auth = house_auth;
            }

            public String getCar_auth() {
                return car_auth;
            }

            public void setCar_auth(String car_auth) {
                this.car_auth = car_auth;
            }
        }
    }
}
