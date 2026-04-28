# [Silver III] Election - 4408

[문제 링크](https://www.acmicpc.net/problem/4408)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 129, 정답: 65, 맞힌 사람: 61, 정답 비율: 49.593%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 정렬, 집합과 맵

### 문제 설명

<p>Canada has a multi-party system of government. Each candidate is generally associated with a party, and the party whose candidates win the most ridings generally forms the government. Some candidates run as independents, meaning they are not associated with any party. Your job is to count the votes for a particular riding and to determine the party with which the winning candidate is associated.</p>

### 입력

<p>The first line of input contains a positive integer n satisfying 2 &lt;= n &lt;= 20, the number of candidates in the riding. n pairs of lines follow: the first line in each pair is the name of the candidate, up to 80 characters; the second line is the name of the party, up to 80 characters, or the word &quot;independent&quot; if the candidate has no party. No candidate name is repeated and no party name is repeated in the input. No lines contain leading or trailing blanks.</p>

<p>The next line contains a positive integer m &lt;= 10000, and is followed by m lines each indicating the name of a candidate for which a ballot is cast. Any names not in the list of candidates should be ignored.</p>

### 출력

<p>Output consists of a single line containing one of:</p>

<ul>
	<li>The name of the party with whom the winning candidate is associated, if there is a winning candidate and that candidate is associated with a party.</li>
	<li>The word &quot;independent&quot; if there is a winning candidate and that candidate is not associated with a party.</li>
	<li>The word &quot;tie&quot; if there is no winner; that is, if no candidate receives more votes than every other candidate.</li>
</ul>