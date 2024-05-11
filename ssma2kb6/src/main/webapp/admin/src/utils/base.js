const base = {
    get() {
        return {
            url : "http://localhost:8080/ssma2kb6/",
            name: "ssma2kb6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssma2kb6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "专利服务系统小程序"
        } 
    }
}
export default base
