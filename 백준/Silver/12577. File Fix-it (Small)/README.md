# [Silver I] File Fix-it (Small) - 12577

[문제 링크](https://www.acmicpc.net/problem/12577)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 62, 맞힌 사람: 52, 정답 비율: 82.540%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>On Unix computers, data is stored in&nbsp;<em>directories</em>. There is one&nbsp;<em>root directory</em>, and this might have several directories contained inside of it, each with different names. These directories might have even more directories contained inside of them, and so on.</p>

<p>A directory is uniquely identified by its name and its parent directory (the directory it is directly contained in). This is usually encoded in a&nbsp;<em>path</em>, which consists of several parts each preceded by a forward slash (&#39;/&#39;). The final part is the name of the directory, and everything else gives the path of its parent directory. For example, consider the path:</p>

<pre>
/home/gcj/finals
</pre>

<p>This refers to the directory with name &quot;finals&quot; in the directory described by &quot;/home/gcj&quot;, which in turn refers to the directory with name &quot;gcj&quot; in the directory described by the path &quot;/home&quot;. In this path, there is only one part, which means it refers to the directory with the name &quot;home&quot; in the root directory.</p>

<p>To create a directory, you can use the&nbsp;<em>mkdir</em>&nbsp;command. You specify a path, and then&nbsp;<em>mkdir</em>will create the directory described by that path, but&nbsp;<em>only if</em>&nbsp;the parent directory already exists. For example, if you wanted to create the &quot;/home/gcj/finals&quot; and &quot;/home/gcj/quals&quot; directories from scratch, you would need four commands:</p>

<pre>
mkdir /home
mkdir /home/gcj
mkdir /home/gcj/finals
mkdir /home/gcj/quals</pre>

<p>Given the full set of directories already existing on your computer, and a set of new directories you want to create if they do not already exist, how many&nbsp;<em>mkdir</em>&nbsp;commands do you need to use?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with a line containing two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>, separated by a space.</p>

<p>The next&nbsp;<strong>N</strong>&nbsp;lines each give the path of one directory that already exists on your computer. This list will include every directory already on your computer other than the root directory. (The root directory is on every computer, so there is no need to list it explicitly.)</p>

<p>The next&nbsp;<strong>M</strong>&nbsp;lines each give the path of one directory that you want to create.</p>

<p>Each of the paths in the input is formatted as in the problem statement above. Specifically, a path consists of one or more lower-case alpha-numeric strings (i.e., strings containing only the symbols &#39;a&#39;-&#39;z&#39; and &#39;0&#39;-&#39;9&#39;), each preceded by a single forward slash. These alpha-numeric strings are never empty.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>No path will have more than 100 characters in it.</li>
	<li>No path will appear twice in the list of directories already on your computer, or in the list of directories you wish to create. A path may appear once in both lists however. (See example case #2 below).</li>
	<li>If a directory is listed as being on your computer, then its parent directory will also be listed, unless the parent is the root directory.</li>
	<li>The input file will be no longer than 100,000 bytes in total.</li>
	<li>0 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of&nbsp;<em>mkdir</em>&nbsp;you need.</p>