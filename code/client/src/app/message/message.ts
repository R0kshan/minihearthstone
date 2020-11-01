export class Message {
    sender: string;
    content: string;
    date: string;

    constructor(sender: string, content: string, date: string) {
        this.sender = sender;
        this.content = content;
        this.date = date;
    }
}
