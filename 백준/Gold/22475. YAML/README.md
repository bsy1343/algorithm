# [Gold V] YAML - 22475

[문제 링크](https://www.acmicpc.net/problem/22475)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 10, 맞힌 사람: 10, 정답 비율: 31.250%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>YAML (YAML Ain&#39;t Markup Language)とは、オブジェクトを文字列で表現する形式の一つです。</p>

<p>YAMLのサブセットで表されたオブジェクトと、プロパティを指定するクエリが与えられるので、指定されたプロパティの値を答えてください。</p>

<h3>YAMLのサブセット</h3>

<p>YAML のサブセットは、次のような拡張 BNF 記法で表される構文規則に従います。</p>

<pre>
yaml: mapping(0)
mapping(n): mapping-item(n) | mapping-item(n) mapping(n)
mapping-item(n): indent(n) key &#39;:&#39; &#39; &#39; string &#39;\n&#39;
                 | indent(n) key &#39;:&#39; &#39;\n&#39; mapping(m) (ただしm&gt;n)
key: [a-z0-9]+ (※英字小文字または数字からなる1文字以上の文字列)
string: [a-z0-9 ]+ (※英字小文字または数字またはスペースからなる1文字以上の文字列)
indent(0): &quot;&quot; (※空文字列)
indent(n+1): &#39; &#39; indent(n) (※スペースをn+1個並べた文字列)
</pre>

<p>&#39;\n&#39;は改行文字を表します。</p>

<p><var>mapping(n)</var> はオブジェクトを表し、<var>mapping(n)</var> に含まれる <var>mapping-item(n)</var> は、オブジェクトに含まれるプロパティを表します。</p>

<p><code>mapping-item(n): indent(n) key &#39;:&#39; &#39; &#39; string &#39;\n&#39;</code> は、 <var>key</var> で表されるプロパティの値がstringで表される文字列であることを示します。</p>

<p><code>mapping-item(n): indent(n) key &#39;:&#39; &#39;\n&#39; mapping(m)</code> は、<var>key</var> で表されるプロパティの値がmapping(m)で表されるオブジェクトであることを示します。</p>

<p>1つのオブジェクトに、2つ以上、同じ key を持つプロパティが含まれることはありません。</p>

<h3>プロパティを指定するクエリの形式</h3>

<p>プロパティを指定するクエリは、</p>

<pre>
.key_1.key_2(..省略..).key_n
</pre>

<p>のように、&#39;<code>.</code>&#39;と <var>key</var> が交互に現れる形で与えられ、これは「 yaml で与えられたオブジェクトの、<var>key<sub>1</sub></var> という <var>key</var> を持つプロパティの値であるオブジェクトの、 <var>key<sub>2</sub></var> という <var>key</var> を持つプロパティの値であるオブジェクトの、(..省略..) <var>key<sub>n</sub></var> という <var>key</var> を持つプロパティ」を表します。</p>

<p>なお、あるi(<var>1 &le; i &le; n - 1</var>)について、.key_1.key_2.(..省略..).key_iまでで表されるプロパティの値がオブジェクトでない、またはオブジェクトであるがkey_i+1というプロパティを含んでいない場合、.key_1.key_2(..省略..).key_n で表されるようなプロパティは存在しないとみなします。</p>

### 입력

<pre>
.key_1.key_2(...).key_n
yaml
</pre>

<ul>
	<li><var>1 &le; n &le; 20</var></li>
	<li>入力全体に含まれる文字数 <var>&le; 50,000</var></li>
</ul>

### 출력

<p>プロパティの値を 1 行で出力してください。</p>

<p>指定されたプロパティが存在しない場合は <code>no such property</code>, プロパティの値がオブジェクトの場合は <code>object</code>, プロパティの値が文字列の場合は <code>string &quot;&lt;文字列の内容&gt;&quot;</code> と出力してください。</p>