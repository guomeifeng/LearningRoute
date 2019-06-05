class NewBlogs extends React.Component {
    global.
    constructor(props) {
        this.state = {
            list: [],
            loading: true
        };
    }
    componentDidMount() {
        axios.get('/new-blogs').then(data => {
            // const blogs = data.data;
            // var component = this;
            this.setState({list: data.data, loading: false })
                // for(var i in blogs) {
                //     this.setState({
                //         title: blogs[i].title,
                //         description: blogs[i].description,
                //         image: blogs[i].image,
                //         loading: false
                //     });
                // }
            })
            .catch(function(error) {
                console.log(error);
            });
        }
        render() {
            return (
                <div>
                    {this.state.list.map(e => (
                        <h2>New Blogs:{e}</h2>
   
                    ))}
                    
                </div>
            );
        }
    }
    export default NewBlogs