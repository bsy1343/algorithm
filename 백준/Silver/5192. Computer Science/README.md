# [Silver I] Computer Science - 5192

[문제 링크](https://www.acmicpc.net/problem/5192)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Computer Science studies ways of solving real-world problems using computers and related technology. This encompasses a lot of issues. One of the great success stories of recent years in computer science is organizing and searching information. Just think about the way everyone&rsquo;s life has changed as a result of web search. Here, we are going to explore a very simple version of a web search engine.</p>

<p>You will be given several documents, consisting of words and hyperlinks (in a simpler format than HTML, though). You will also be given queries (one word each), and are to find out the most relevant search results. A page P is relevant either because (1) the search term appears in the page, or (2) the search term appears in a page pointing to P, close to the hyperlink<sup>3</sup>. Specifically, if q is the query term, then P gets one point for each occurrence of q in P. In addition, if L is a hyperlink from P&#39; to P, then P gets max(4&minus;d, 0) points for each occurrence of q at distance d words of L (that is, the score is 4 &minus; d if d &lt; 4, and 0 otherwise). If q appears in the hyperlink, then it is worth 4 points, as d = 0. Notice that the same occurrence in P&#39; can count multiple times if it is close to multiple hyperlinks to P.</p>

<p><sup>3</sup>The latter is actually more important. Often, what people linking to you say about you is a better description than what you yourself say. One reason is that web pages can otherwise use spamming to attract additional visits. Another is that web pages often don&rsquo;t contain all relevant terms.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two numbers m and n, the number of queries, and the number of web pages. Both numbers will be between 1 and 100.</p>

<p>Next are m queries. Each query will be a single word of no more than 20 letters, on a line by itself. All words will consist only of lowercase letters.</p>

<p>This is followed by the description of n web pages. The description of web page i begins with the number ℓi of lines that page i consists of (between 1 and 100). This is followed by ℓi lines of text, each at most 255 characters. Text is a sequence of words, separated by spaces. Each word consists only of lowercase letters, and is at most 20 characters long. Some words can be marked as hyperlinks. This is done by enclosing them in square brackets, with the number of the page that the link goes to. For example, [usc,3] would describe a hyperlink to page 3 displaying the word usc. The number will always be between 1 and n, i.e., a legal page. Also, we will never have self-links.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, for each of the queries, output the page with the highest score on a line by itself. If there are multiple pages with the same highest score, output all of them on one line (separated by spaces), sorted by increasing page number.</p>