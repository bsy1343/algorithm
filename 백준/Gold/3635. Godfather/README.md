# [Gold III] Godfather - 3635

[문제 링크](https://www.acmicpc.net/problem/3635)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 61, 정답: 29, 맞힌 사람: 28, 정답 비율: 49.123%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Last years Chicago was full of gangster fights and strange murders. The chief of the police got really tired of all these crimes, and decided to arrest the mafia leaders.&nbsp;</p>

<p>Unfortunately, the structure of Chicago mafia is rather complicated. There are $n$ persons known to be related to mafia. The police have traced their activity for some time, and know that some of them are communicating with each other. Based on the data collected, the chief of the police suggests that the mafia hierarchy can be represented as a tree. The head of the mafia, Godfather, is the root of the tree, and if some person is represented by a node in the tree, its direct subordinates are represented by the children of that node. For the purpose of conspiracy the gangsters only communicate with their direct subordinates and their direct master.</p>

<p>Unfortunately, though the police know gangsters&#39; communications, they do not know who is a master in any pair of communicating persons. Thus they only have an undirected tree of communications, and do not know who Godfather is.</p>

<p>Based on the idea that Godfather wants to have the most possible control over mafia, the chief of the police has made a suggestion that Godfather is such a person that after deleting it from the communications tree the size of the largest remaining connected component is as small as possible. Help the police to find all potential Godfathers and they will arrest them.</p>

### 입력

<p>The first line of the input file contains $n$ --- the number of persons suspected to belong to mafia ($2 \le n \le 50\,000$). Let them be numbered from 1 to $n$.</p>

<p>The following $n - 1$ lines contain two integer numbers each. The pair $a_i$, $b_i$ means that the gangster $a_i$ has communicated with the gangster $b_i$. It is guaranteed that the gangsters&#39; communications form a tree.</p>

### 출력

<p>Print the numbers of all persons that are suspected to be Godfather. The numbers must be printed in the increasing order, separated by spaces.</p>