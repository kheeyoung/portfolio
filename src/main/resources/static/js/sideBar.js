class SideBar {

    constructor(target, direction) {
        if(typeof target === 'string'){
            this.target = document.querySelector(target);
        }else{
            this.target = target;
        }

        this.direction = left;
        this.opened = false;
        this.width = this.target.offsetWidth;
        this.init();
    }

    init() {
        this.target.style[this.direction] = `-${this.width}px`;
    }

    open() {
        if(this.opened){
            this.close();
            console.log("측면 바 닫기");
            return;
        }
        this.opened = true;
        this.target.style[this.direction] = `0`;
    }

    close() {
    console.log("close");
        this.target.style[this.direction] = `-${this.width}px`;
        this.opened = false;
    }
}
