# [Silver I] Conversation Log - 11482

[문제 링크](https://www.acmicpc.net/problem/11482)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 121, 정답: 57, 맞힌 사람: 51, 정답 비율: 54.839%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Popular social networking site My+Din is struggling to manage its many popular forums. Recent regulation requires the site to report users engaged in conversations about certain topics. The sheer number of users means manual monitoring is too costly and so the site has asked its many interns to come up with a solution.</p>

<p>One intern has theorized that conversations about any given topic will see the same key words used over and over. If the most used words can be identified perhaps manual investigation can be directed towards appropriate forums.</p>

### 입력

<ul>
	<li>One line containing a single integer M (1 &le; M &le; 10<sup>4</sup>), the number of messages.</li>
	<li>M more lines each beginning with a user&rsquo;s name of no more than 20 characters and continuing with the content of that user&rsquo;s message all in lower case. The total number of characters across all messages, including spaces, will not exceed 2 &times; 10<sup>6</sup>.</li>
</ul>

### 출력

<p>Several words, one per line, listing the words used by every single user on the forum, ordered from most to least used and in case of a tie in alphabetical order. If there are no such words, output ALL CLEAR.</p>