<h1 align="center">API in Javascript.</h1>


JavaScript APIs for WebExtensions can be used inside the extension's background scripts and in any other documents bundled with the extension, including browser action or page action popups, sidebars, options pages, or new tab pages. A few of these APIs can also be accessed by an extension's content scripts. (See the list in the content script guide.)

To use the more powerful APIs, you need to request permission in your extension's manifest.json.

Example 1:

                        async function glady(){
                              let p=fetch("https://api.chucknorris.io/jokes/random")
                              p.then((value1)=>{
                                    return value1.json()
                                }).then((val2)=>{
                                    let p=val2.value;
                                    return console.log(p);
                                })

                                }

                                glady();