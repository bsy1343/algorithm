# [Platinum II] Ducks in a Row - 15123

[문제 링크](https://www.acmicpc.net/problem/15123)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 11, 맞힌 사람: 10, 정답 비율: 35.714%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Sri is playing a game with ducks, geese, and a magic wand. First he puts all his ducks in a row. Next his friend Srinivas inserts some geese between the ducks at different places. Sri can then use his magic wand to flip some of the ducks and geese. </p>

<p>Each use of his wand can be defined formally:</p>

<ol>
	<li>Sri can select some contiguous sequence of ducks and geese.</li>
	<li>All birds that were ducks before using the wand are now geese.</li>
	<li>All birds that were geese before using the wand are now ducks.</li>
</ol>

<p>Sri has an objective to succeed at the game. He must turn the row into at least k maximal runs of consecutive ducks of length at least n. A maximal run is a sequence of ducks that does not have a duck immediately to its left or right. For example, the following row of birds has 4 maximal runs of ducks of lengths 2, 3, 3, and 1, respectively:</p>

<p style="text-align:center"><strong>D</strong> <strong>D</strong> G G G G <strong>D</strong> <strong>D</strong> <strong>D</strong> G <strong>D</strong> <strong>D</strong> <strong>D</strong> G <strong>D</strong></p>

<p>Sri needs to find the minimum number of wand uses to meet his objective. There can be other maximal runs of consecutive ducks at the end of the game, maybe some of length &lt;n, but there must be at least k of at least length n.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will consist of exactly two lines. The first line will contain two integers n and k (1 &le; n, k &le; 2,000), where n is the minimum length of each sequence of ducks that Sri desires, and k is the minimum number of sequences of ducks that Sri desires. The second line will contain a single string, s (1 &le; |s| &le; 2,000), consisting of only the capital letters D and G. They represent the row of birds before Sri starts using his magic wand, where D is a duck and G is a goose.</p>

### 출력

<p>Output a single integer, the minimum number of times he must use his wand to meet his desired property or -1 if it is not possible.</p>