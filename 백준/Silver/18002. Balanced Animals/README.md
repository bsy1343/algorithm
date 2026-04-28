# [Silver II] Balanced Animals - 18002

[문제 링크](https://www.acmicpc.net/problem/18002)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 86, 맞힌 사람: 60, 정답 비율: 71.429%

### 분류

브루트포스 알고리즘, 정렬, 이분 탐색, 누적 합

### 문제 설명

<p>To save money, Santa Claus has started hiring other animals besides reindeer to pull his sleigh via short term contracts. As a result, the actual animals that show up to pull his sleigh for any given trip can vary greatly in size.</p>

<p>Last week he had 2 buffalo, 37 voles and a schnauzer. Unfortunately, both buffalo were hitched on the left side and the entire sleigh flipped over in mid-flight due to the weight imbalance.</p>

<p>To prevent such accidents in the future, Santa needs to divide the animals for a given trip into two groups such that the sum of the weights of all animals in one group equals the sum of the weights of all animals in the other. To make the hitching process efficient, Santa is seeking an integer target weight <em>t</em> such that all animals that are lighter than <em>t</em> go in one group and those heavier than <em>t</em> go into the other. If there are multiple such <em>t</em>, he wants the smallest one. There&#39;s one small wrinkle: what should be done if there some animals have weight exactly equal to <em>t</em>? Santa solves the problem this way: if there are an even number of such animals, he divides them equally among the two groups (thus distributing the weight evenly). But if there are an odd number of such animals, then one of those animals is sent to work with the elves to make toys (it is not put in either group), and the remaining (now an even number) are divided evenly among the two groups.</p>

### 입력

<p>The first line contains an integer <em>n</em> (2 &le; <em>n</em> &le; 10<sup>5</sup>), indicating the number of animals.</p>

<p>Each of the next <em>n</em> lines contain a positive integer <em>w</em> (1 &le; <em>w</em> &le; 2 ∙ 10<sup>5</sup>). These are the weights of the animals (in ounces).</p>

### 출력

<p>Output the smallest integer target weight <em>t</em>, as described above. It&#39;s guaranteed that it is possible to find such an integer.</p>