<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles"	uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<tiles:insertDefinition name="base.layout">
	<tiles:putAttribute name="title"> :: 로그인</tiles:putAttribute>
	<tiles:putAttribute name="javascript">	
		<script type="text/javascript">
		</script>
	</tiles:putAttribute>
	<tiles:putAttribute name="body" >
		<div class="ui grid container">
			<div class="row" id="page-header">
			    <div class="ui basic segment">
			      <h1 class="ui sub header">
			      안녕하세요?
			      </h1>
			      <span> ${result }</span>
			    </div>
			  </div>
			  <div class="row" id="article">
    <div class="eleven wide column">
      <h2 class="ui sub header">
        Sample blog post
      </h2>
      <span>March 6, 2017 by <a href="blog.html">Jack</a></span>
      <div class="ui hidden divider"></div>
      <p>
        This blog post shows a few different types of content that's supported and styled with Semantic-UI. Basic typesetting, list, and code are all supported.
      </p>
      <div class="ui divider"></div>
      <p>
        Cum sociis natoque penatibus et magnis <a href="blog.html">dis parturient montes</a>, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.
      </p>
      <blockquote>Curabitur blandit tempus porttitor. Nullam quis risus eget urna mollis ornare vel eu leo. Nullam id dolor id nibh ultricies vehicula ut id elit.</blockquote>
      <p>
        Etiam porta sem malesuada magna mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.
      </p>
      <h3 class="ui large header">
        Heading
      </h3>
      <p>
        Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
      </p>
      <h4 class="ui medium header">
        Sub-heading
      </h4>
      <p>
        Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
      </p>
      <div class="ui secondary segment">
        <code>Example code block</code>
      </div>
      <p>
        Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.
      </p>
      <h4 class="ui medium header">
        Sub-heading
      </h4>
      <p>
        Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
      </p>
      <div class="ui list">
        <div class="item">
          <div class="ui bulleted list">
            <div class="item">
              Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
            </div>
            <div class="item">
              Donec id elit non mi porta gravida at eget metus.
            </div>
            <div class="item">
              Nulla vitae elit libero, a pharetra augue.
            </div>
          </div>
        </div>
      </div>
      <p>
        Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae elit libero, a pharetra augue.
      </p>
      <div class="ui list">
        <div class="item">
          <div class="ui ordered list">
            <div class="item">
              Vestibulum id ligula porta felis euismod semper.
            </div>
            <div class="item">
              Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
            </div>
            <div class="item">
              Maecenas sed diam eget risus varius blandit sit amet non magna.
            </div>
          </div>
        </div>
      </div>
      <p>
        Cras mattis consectetur purus sit amet fermentum. Sed posuere consectetur est at lobortis.
      </p>
      <div class="ui hidden divider"></div>
      <h2 class="ui sub header">
        Another blog post
      </h2>
      <span>April 1, 2027 by <a href="blog.html">Mac</a></span>
      <div class="ui hidden divider"></div>
      <p>
        Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.
      </p>
      <blockquote>Curabitur blandit tempus porttitor. Nullam quis risus eget urna mollis ornare vel eu leo. Nullam id dolor id nibh ultricies vehicula ut id elit.</blockquote>
      <p>
        Etiam porta sem malesuada magna mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.
      </p>
      <p>
        Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
      </p>
      <div class="ui hidden divider"></div>
      <h2 class="ui sub header">
        New feature
      </h2>
      <span>Autumn 13, 2019 by <a href="blog.html">Semantic</a></span>
      <div class="ui hidden divider"></div>
      <p>
        Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Sed posuere consectetur est at lobortis. Cras mattis consectetur purus sit amet fermentum.
      </p>
      <div class="ui list">
        <div class="item">
          <div class="ui bulleted list">
            <div class="item">
              Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
            </div>
            <div class="item">
              Donec id elit non mi porta gravida at eget metus.
            </div>
            <div class="item">
              Nulla vitae elit libero, a pharetra augue.
            </div>
          </div>
        </div>
      </div>
      <p>
        Etiam porta sem malesuada magna mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.
      </p>
      <p>
        Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
      </p>
      <div class="ui basic segment">
        <div class="ui basic circular huge button">
          <a href="blog.html#">Previous</a>
        </div>
        <div class="ui basic circular huge button">
          <a href="blog.html#">Next</a>
        </div>
      </div>
    </div>
    <div class="four wide right floated column">
    <img src="${map.myImage}"/>
    
      <div class="ui secondary segment">
        <h4 class="ui header">
          About
        </h4>
        <p>
          Etiam porta <i>sem malesuada magna mollis euismod</i>. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.
        </p>
      </div>
      <h4 class="ui header">
        Archives
      </h4>
      <div class="ui list">
        <a class="item">Septempber 2017</a><a class="item">August 2017</a><a class="item">June 2017</a><a class="item">April 2017</a><a class="item">March 2017</a><a class="item">February 2017</a><a class="item">January 2017</a><a class="item">December 2016</a><a class="item">October 2016</a><a class="item">July 2016</a><a class="item">July 2016</a><a class="item">May 2016</a><a class="item">April 2016</a><a class="item">January 2016</a><a class="item">May 2015</a>
      </div>
      <div class="ui hidden divider"></div>
      <h4 class="ui header">
        Elsewhere
      </h4>
      <div class="ui list">
        <a class="item">GitHub</a><a class="item">Twitter</a><a class="item">Google+</a><a class="item">Facebook</a>
      </div>
    </div>
  </div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>



