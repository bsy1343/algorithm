# [Gold III] Walk of Three - 21629

[문제 링크](https://www.acmicpc.net/problem/21629)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 89, 정답: 35, 맞힌 사람: 27, 정답 비율: 39.706%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>The city where Vasya lives has a park with $n$ lawns connected by $m$ paths. One can walk in both directions along each path. The lawns connected by the path are called neighbors.</p>

<p>The entrance to the park is near the lawn number one which will be called the entrance lawn. Vasya&#39;s parents are very concerned about his safety, so they allow him to play only on the lawn that is a neighbor to the entrance lawn. Entrance lawn is usually overcrowded, so Vasya can&#39;t play on it.</p>

<p>Vasya finds it boring to simply walk along the path to the neighbor lawn. Instead, he starts at the entrance lawn, and walks along exactly three different paths. After that he plays on the lawn where he ends his walk. Vasya does not break the rules set by the parents, so he always ends his walk on the lawn neighboring to the entrance lawn.</p>

<p>Every day Vasya wants to choose a new walk he hasn&#39;t taken before. Help him to determine how many ways are to begin his journey at the entrance lawn, follow exactly three different paths, and find himself on the lawn neighboring to the entrance lawn.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ --- the number of lawns and the number of paths, respectively ($1 \leq n \leq 100\,000$, $1 \leq m \leq 200\,000$).&nbsp;</p>

<p>The next $m$ lines contain pairs of lawns connected by paths. Any two lawns are connected by no more than one path. There are no paths connecting a lawn to itself.</p>

### 출력

<p>Print the number of walks that Vasya can take.</p>