# [Platinum III] Waif Until Dark - 15077

[문제 링크](https://www.acmicpc.net/problem/15077)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>&ldquo;Waif Until Dark&quot; is a daycare center specializing in children of households where both parents work during the day. In order to keep the little monsters ... that is, darlings ... occupied, the center has a set of toys that the kiddies can play with. Some of these toys belong to one of several categories &ndash; sports toys, musical toys, dolls, etc. In order to save wear and tear on these types of toys, the teachers allow only certain numbers of toys of each category to be used during playtime. Of course, kids being kids, not all of the toys are liked by everyone, so sometimes it&rsquo;s difficult to make sure every kid has a toy they like. Given all of these constraints, the CEO of Waif has come to you to write a little program to determine the maximum number of these monsters (let&rsquo;s be honest here) who can be satisfied.</p>

### 입력

<p>Input starts with a line containing three integers n m p indicating the number of children, the number of toys and the number of toy categories (1 &le; n, m &le; 100, 0 &le; p &le; m). Both children and toys are numbered starting at 1. After this line are n lines of the form k i<sub>1</sub> i<sub>2</sub> ... i<sub>k</sub> (1 &le; k, i<sub>1</sub>, i<sub>2</sub>, . . . i<sub>k</sub> &le; m); the j th of these lines indicates that child j is willing to play with toys i<sub>1</sub> through i<sub>k</sub>. Next are p lines of the form l t<sub>1</sub> t<sub>2</sub> ... t<sub>l</sub> r (1 &le; r &le; l &le; m, 1 &le; t<sub>1</sub>, t<sub>2</sub>, . . . t<sub>l</sub> &le; m); the j th of these lines indicates that toys t<sub>1</sub> through t<sub>l</sub> are in category j and that at most r of these toys can be used. Toys can be in at most one category and any toy not listed in these p lines is not in any toy category and all of them can be used. No toy number appears more than once on any line.</p>

### 출력

<p>Display the maximum number of children that can be satisfied with a toy that they like.</p>