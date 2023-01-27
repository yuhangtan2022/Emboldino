export class ArtWork {
    id: number = 1;
    subject: string = "";
    description: string = "";
    url: string = "";
    style : string = "";
    type : string = "";
    price : number = 0.0;
}

export const ART_WORKS : ArtWork[]  = [
    {
        id : 1,
        subject: "Paint #1",
        description: "This is paint #1",
        style : "European",
        url: "",
        type : "Oil paint",
        price : 100.0
    },
    {
        id : 2,
        subject: "Paint #2",
        description: "This is paint #2",
        style : "European",
        type : "Oil paint",
        url: "",
        price : 200.0
    },
    {
        id : 3,
        subject: "Paint #3",
        description: "This is paint #3",
        url: "",
        style : "Chinese",
        type : "Pencil paint",
        price : 300.0
    },
]