# [Platinum V] Jumping Frog - 15061

[문제 링크](https://www.acmicpc.net/problem/15061)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 45, 맞힌 사람: 41, 정답 비율: 67.213%

### 분류

유클리드 호제법, 수학, 정수론

### 문제 설명

<p>Pog the Frog wants to compete in the World Frog Jump competition, which will take place in Nlogonia. In the competition, each frog must perform a sequence of acrobatic jumps in a specially built arena. The arena is composed of N equally spaced positions around a circumference (the arc between two adjacent positions is always the same length) where each position can be either a rock or a pond. The positions are numbered sequentially from 0 to N &minus; 1 in the clockwise direction, so that judges can easily make notes about which jumps were performed in each position. Thus, position 0 is adjacent to positions 1 and N &minus; 1 in the arena.</p>

<p>The competition rules stipulate that the sequence of jumps of each frog must start at a rock, always go from a rock to another rock, and finish at the same position it started. The rules do not require frogs to use every rock in the arena for their sequence of jumps.</p>

<p>Pog the Frog is currently practicing for the competition. He must develop two skills. First, he needs to get better at jumping from one rock to another, since landing on either a pond or outside of the marked positions can mean disqualification. Besides that, he must learn impressing acrobatic moves. With that in mind, he has decided on a practicing strategy. In the beginning of each practice session, Pog the Frog will pick a starting rock and an integer jump length K between 1 and N &minus; 1. After that, whenever he is standing on a rock numbered i, he will aim his next acrobatic jump at the rock whose number is obtained by getting the remainder of the division of i + K by N. He will stop when he lands on the starting rock. For example, if the arena has 3 positions, all of them rocks, and Pog the Frog starts at position 0 and picks K = 2, he will first jump from rock 0 to rock 2, then to rock 1, and finally jump back to rock 0. At this point, his practice session ends.</p>

<p>Given the description of the N positions in the arena, help Pog the Frog by answering this question: how many distinct values of K can he choose for his practice sessions, if he can use any rock as a starting position for his sequence of jumps?</p>

### 입력

<p>The input consists of a single line that contains a string S of N characters (3 &le; N &le; 10<sup>5</sup>), representing the positions in the arena. The i-th character of S (i = 0, 1, . . . , N &minus; 1) indicates that the position i in the arena is either a rock (uppercase letter &ldquo;R&rdquo;) or a pond (uppercase letter &ldquo;P&rdquo;).</p>

### 출력

<p>Output a single line with an integer representing the number of distinct jump lengths that Pog the Frog can choose for his practice sessions, given that he can use any rock as a starting position for his sequence of jumps.</p>