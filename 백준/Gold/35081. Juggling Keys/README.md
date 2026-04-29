# [Gold II] Juggling Keys - 35081

[문제 링크](https://www.acmicpc.net/problem/35081)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 16, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

그리디 알고리즘, 스위핑, 정렬, 해 구성하기

### 문제 설명

<p>Nearly a hundred people are involved in making NWERC possible -- organizers, volunteers, jury, the systems and streaming team, and last but not least, the DOMjudge team, who are responsible for the judging system. They come to every NWERC and always have a lot of fun while being there!</p>

<p>The DOMjudge team members like to share a flat during NWERC, but often, there are not enough keys for everybody to have their own. This can make logistics a bit tricky: some people like to head out early for breakfast, others stay out late at the Christmas market, and some may return to the flat for a quick afternoon nap. If someone returns to the flat while another person is already in the flat, they can simply ring the bell and will be let in. However, if someone returns while the flat is empty, they will need to have a key with them.</p>

<p>Given the times when each person is out on a trip, determine when each person should take a key with them so that everyone can get into the flat without being (temporarily) locked out.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35081.%E2%80%85Juggling%E2%80%85Keys/ec3f5602.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35081-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 465px; height: 100px;"></p>

<p style="text-align: center;">Figure J.1: Illustration of Sample Input 1, with $3$ DOMjudge team members, $2$ keys, and a total of 5 trips. Trips where the person brings a key are shown in bold. Twice, a person comes home to an empty house and has to use their key to open the door.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with three integers $n$, $k$, and $q$ ($1\le k\le n\le 10^5$, $1\le q\le 10^5$), the number of DOMjudge team members, the number of keys, and the number of trips.</li>
<li>$q$ lines, each with three integers $p$, $\ell$, and $r$ ($1\le p \le n$, $0\leq \ell &lt; r\le 10^9$), describing a trip where person $p$ leaves at time $\ell$ and returns at time $r$.</li>
</ul>

<p>At any time, at most one person arrives or leaves.</p>

<p>It is guaranteed that for each person, the trips they make do not touch or overlap.</p>

### 출력

<p>If it is possible to distribute keys such that no one is locked out, output a string of $q$ characters, where each character is either '<code>0</code>' or '<code>1</code>'. The $i$th character of the string is '<code>1</code>' if the person going on the $i$th trip (in input order) should take a key with them and '<code>0</code>' if they should not take a key with them. Otherwise, output "<code>impossible</code>".</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>