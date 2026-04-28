# [Gold V] There is no place like 127.0.0.1 - 11339

[문제 링크](https://www.acmicpc.net/problem/11339)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 126, 정답: 45, 맞힌 사람: 36, 정답 비율: 39.560%

### 분류

구현, 문자열, 이분 탐색, 집합과 맵, 파싱

### 문제 설명

<p>A friend of yours is a bit on a geeky side. Among other things, he likes to replace some common English words with... IPv4 addresses?!?</p>

<p>Being a good friend you would like to at least remove these literary abominations from his documents. You somehow got hold of his map of words to addresses (or, it turns out, to range of addresses). Now you would like to replace IPv4 addresses with the original English words.</p>

<p>IPv4 address, if you are not familiar with it, is a 32-bit unsigned integer usually represented in dot-decimal notation (e.g. 172.30.12.255 - 4 8-bit unsigned integers separated by dots).</p>

### 입력

<p>First line of the input contains an integer T (1 &lt;= T &lt;= 50) - the number of test cases.</p>

<p>Each test case consists of two sections - map and text.</p>

<p>Map section starts with an integer M (1 &lt;= M &lt;= 1000) on the next line, the number of map entries. Each of the next M lines contains an entry that can contain either word followed by an IP address or a word followed by 2 IP addresses (see sample input). In the first case, only the given address should be replaced with a word. In the second case, any address within the range should be replaced with the given word. If a range is given, the first address will always be less than the second one.</p>

<p>There will be no duplicate entries in the map, meaning no word will apear more than once and no address will repeat. There will be no overlapping ranges of addresses either.</p>

<p>Text section starts with an integer N (1 &lt;= N &lt;= 1000) on the next line, the number of lines of text. Each of the next T lines contains at most 20 words and/or IP addresses separated by single spaces. Words will contain only letters of English alphabet and IP addresses will be valid (consisting only of digits and dots).</p>

### 출력

<p>For each test case and for each line of text, replace all IP addresses for which you have matching words and print the result to the output. If there is no word mapped to an address that appears in the text, just print the address as is.</p>