# [Platinum III] Vera and Banquet - 15445

[문제 링크](https://www.acmicpc.net/problem/15445)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

문자열, 브루트포스 알고리즘, 무작위화, 접미사 배열과 LCP 배열

### 문제 설명

<p>Vera knows 26 recipes, each represented by a lowercase letter from a to z. She is preparing a banquet consisting of N dishes arranged around a circular table. Since Vera is lazy, each dish is independently and uniformly randomly chosen from one of her 26 recipes. The banquet can be represented as a string S of length N where Si is the recipe of dish i (1 &le; i &le; N). Dish j is clockwise to dish j &minus; 1 for 2 &le; j &le; N and dish 1 is clockwise to dish N.</p>

<p>A sample is the sequence of recipes in a consecutive section of dishes in either clockwise or counterclockwise direction.</p>

<p>Line 1 contains integer N (2 &le; N &le; 50000). Line 2 contains string S of N lowercase letters. It is guaranteed that S represents a banquet created by the described process.Vera wonders how many different samples there are. Two samples are the same if they have the same length and the same recipe at every position.</p>

### 입력

<p>Line 1 contains integer N (2 &le; N &le; 50000).</p>

<p>Line 2 contains string S of N lowercase letters. It is guaranteed that S represents a banquet created by the described process.</p>

### 출력

<p>Print one line with one integer, the number of different samples.</p>

### 힌트

<p>For the first example, the eight different samples are a, b, aa, ab, ba, aba, aab, baa.</p>

<p>For the second example, rejo, drejon are clockwise samples and nojer, dnojer are counter-clockwise samples.</p>