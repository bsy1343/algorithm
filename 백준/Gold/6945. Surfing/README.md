# [Gold III] Surfing - 6945

[문제 링크](https://www.acmicpc.net/problem/6945)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 2, 맞힌 사람: 2, 정답 비율: 8.696%

### 분류

너비 우선 탐색, 자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 파싱, 문자열, 집합과 맵

### 문제 설명

<p>Every web page is identified by a string of characters known as a URL (Uniform Resource Locator). Web pages are formatted using HTML (Hypertext Markup Language). HTML has many codes, collectively known as markup, that allow the author to specify the format of the pages as well as to specify links to other pages. For this problem, we are concerned only with the markup that identifies links to other pages within a given page.</p>

<p>A link within the page is denoted <code>&lt;A HREF=&quot;URL&quot;&gt;</code> where <code>URL</code> is the URL of some other page. A user viewing a page containing a link may click on the link to view the other page.</p>

<p>You are to write a program that reads a number of web pages and their associated URLs. For each link on each page, you must print the URL of the page containing the link, and the URL of the page referred to by the link. Following the last page, you are then given several pairs of URLs. For each pair, you are to assume that you are viewing the page identified by the first URL, and determine whether it is possible to click a sequence of links so as to view the page identified by the second URL. If so, you should print <code>Can surf from here to there.</code> where <code>here</code> and <code>there</code> are the two URLs. If not you should print <code>Can&#39;t surf from here to there.</code></p>

### 입력

<p>The first line of input will contain an integer $n \le 100$, the number of web pages. For each web page, there will be a line containing its URL, followed by several lines containing the page. The URL will consist of up to 80 non-blank printable characters and will not contain any quotation marks. The first line of the page will be <code>&lt;HTML&gt;</code> and the last line will be <code>&lt;/HTML&gt;</code>. Each page will contain up to 100 links in the format described above. Each link will be contained within a single line of input. URLs in the link will be those of pages given in the input. The markup keywords <code>A</code>, <code>HREF</code>, and <code>HTML</code> will appear only in uppercase.</p>

<p>Following the $n$ pages will be several pairs of lines giving URLs required by the problem as specified above. The last line of input will be <code>The End</code>.</p>

### 출력

<p>For each pair, print the appropriate message given above.</p>