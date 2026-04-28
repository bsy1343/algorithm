# [Gold I] A Well-Formed Problem - 6380

[문제 링크](https://www.acmicpc.net/problem/6380)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 22, 맞힌 사람: 14, 정답 비율: 41.176%

### 분류

구현, 자료 구조, 문자열, 파싱, 스택

### 문제 설명

<p>XML, eXtensible Markup Language, is poised to become the lingua franca of structured data communication for the foreseeable future, due in part to its strict formatting requirements. XML parsers must report anything that violates the rules of a well-formed XML document. An XML document is said to be well-formed if it meets all of the well-formedness constraints as defined by the World Wide Web Consortium (W3C) XML specification.</p>

<p>XML documents are composed of units called elements, that contain either character data and/or other elements. Elements may also contain within their declaration values called attributes. Consider the following XML document:</p>

<pre>
&lt;?xml version=&quot;1.0&quot;?&gt; 
&lt;<strong>customer</strong>&gt;
            &lt;<strong>name</strong>&gt;
                        &lt;<strong>first</strong>&gt;John&lt;/<strong>first</strong>&gt; 
                        &lt;<strong>last</strong>&gt;Doe&lt;/<strong>last</strong>&gt;
            &lt;/<strong>name</strong>&gt; 
            &lt;<strong>address</strong>&gt;
                        &lt;<strong>street</strong>&gt; 
                                    &lt;<strong>number</strong>&gt;15&lt;<strong>/number</strong>&gt;
                                    &lt;<strong>direction</strong>&gt;West&lt;/<strong>direction</strong>&gt;
                                    &lt;<strong>name</strong>&gt;34th&lt;/<strong>name</strong>&gt; 
                        &lt;/<strong>street</strong>&gt;
                        &lt;<strong>city</strong>&gt;New York&lt;/<strong>city</strong>&gt; 
                        &lt;<strong>state-code</strong>&gt;NY&lt;/<strong>state-code</strong>&gt;
                        &lt;<strong>zip-code</strong> format=&quot;PLUS4&quot;&gt;10001-0001&lt;/<strong>zip-code</strong>&gt; 
                        &lt;<strong>country-code</strong>&gt;USA&lt;/<strong>country-code</strong>&gt;
            &lt;/<strong>address</strong>&gt;
            &lt;<strong>orders</strong>/&gt; 
&lt;/<strong>customer</strong>&gt;</pre>

<p>The bold identifiers contained within angle brackets are the elements of the document. The italicized identifier &quot;format&quot; within the &quot;zip-code&quot; element is an attribute of that element. All elements, with the exception of &quot;orders&quot;, have a start and an end declaration, also called a tags. The &quot;orders&quot; element is an empty element, as indicated by the &quot;/&gt;&quot; sequence that closes the element, and does not require a separate end-tag. The first line is a processing instruction for an XML parser and is not considered an element of the document.</p>

<p>The rules for a well-formed document are:</p>

<ol>
	<li><strong>There is exactly one element that is not contained within any other element.</strong> This element is identified as the &quot;root&quot; or &quot;document&quot; element. In the example above, &quot;customer&quot; is the document element.</li>
	<li><strong>The structure of an XML document must nest properly.</strong> An element&#39;s start-tag must be paired with a closing end-tag if it is a non-empty element.</li>
	<li><strong>The name in an element&#39;s end-tag must match the element type in the start-tag.</strong> For example, an element opened with &lt;address&gt; must be closed by &lt;/address&gt;.</li>
	<li><strong>No attribute may appear more than once in the same start-tag or empty-element tag.</strong></li>
	<li><strong>A parsed element must not contain a recursive reference to itself</strong>. For example, it is improper to include another address element within an address element.</li>
	<li><strong>A named attribute must have an associated value.</strong></li>
</ol>

### 입력

<p>The input file will contain a series of XML documents. The start of each document is identified by a line containing only the processing instruction &quot;&lt;?xml version=&quot;1.0&quot;?&gt;&quot;. The end of the input is identified by a line containing only the text &quot;&lt;?end?&gt;&quot; (this is not a true XML processing instruction, just a sentinel used to mark the end of the input for this problem). As with all XML documents, white space between elements and attributes should be ignored. You may make the following assuptions with regard to the input.</p>

<ul>
	<li>The only processing instruction that will be present is the XML version processing instruction, and it will always appear only at the beginning of each document in the input.</li>
	<li>Element and attribute names are case-sensitive. For example, &lt;Address&gt; and &lt;address&gt; are considered to be different.</li>
	<li>Element and attribute names will use only alpha-numeric characters and the dash &quot;-&quot; character.</li>
	<li>XML comments will not appear in the input.</li>
	<li>Values for attributes will always be properly enclosed in double quotes.</li>
</ul>

### 출력

<p>For each input XML document, output a line containing the text &quot;well-formed&quot; if the document is well-formed, &quot;non well-formed&quot; otherwise.</p>

<p>&nbsp;</p>