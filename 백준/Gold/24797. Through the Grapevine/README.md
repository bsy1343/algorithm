# [Gold IV] Through the Grapevine - 24797

[문제 링크](https://www.acmicpc.net/problem/24797)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>According to Wikipedia, to hear something &quot;through the grapevine&quot; is to learn of something informally and unofficially by means of gossip or rumor. In this problem, you are tasked with determining how many people will hear about a particular rumor &quot;through the grapevine&quot; after a certain number of days.</p>

<p>Rumors are always started by a single person. On any given day, a person who knows the rumor can spread it by telling the people that they know. Upon hearing of the rumor, that person must wait until the following day before they can begin to spread it themselves. Furthermore, some people are skeptical and will only spread the rumor once they&#39;ve heard it from a number of distinct sources. However once a person has heard the rumor from enough people, they will always try to spread the rumor to as many people as possible.</p>

### 입력

<p>The first line will contain three integers: $0 &lt; n \leq 100\,000$, $0 &lt; m \leq 100\,000$, and $0 \leq d \leq 10\,000$, where $n$ is the number of people, $m$ is the number of connections, and $d$ is the number of days that elapse.</p>

<p>The next $n$ lines will each consist of a unique string $s$ and an integer $0 \leq t \leq 1000$ where $s$ is the name of a person and $t$ is their level of skepticism. In other words, person $s$ must hear the rumor from $t$ distinct other people before $s$ will begin spreading the rumor.</p>

<p>This is followed by $m$ lines each consisting of two strings $u$ and $v$ which indicates that person $u$ and person $v$ know each other. &nbsp;Each of these lines represents a unique pair of persons.</p>

<p>The final line will contain a single string $r$, the name of the person that the rumor originates from. Note that $r$ is the only person with skepticism $t = 0$. All strings are between $1$ and $20$ characters long and consists only of letters and digits.</p>

### 출력

<p>Output a single integer: the number of people (not including person $r$) that have heard the rumor after $d$ days.</p>