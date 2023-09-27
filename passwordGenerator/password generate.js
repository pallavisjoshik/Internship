class Password{
    constructor(){
        console.log("Welcome to password generator");
    }
    generatePassword(len){
        let chars = "abcdefghijklmnopqrstuvwxyz";
        let numbers = "1234567890";
        let special = "!@#$^&*()_%";
        if(len<8){
            console.log("Your password should be minimum of 8 characters and maximum of 16 characters only");
        }
        else{
            let i = 0
            while(i < len){
                this.pass += chars[Math.floor(Math.random() * chars.length)]
                this.pass += numbers[Math.floor(Math.random() * numbers.length)]
                this.pass += special[Math.floor(Math.random() * special.length)]
                i +=3;
            }
            // this.pass = this.pass.substr(len-8, len)
            return this.pass
        }
    }
}
let p = new Password()
console.log(p.generatePassword(8))
