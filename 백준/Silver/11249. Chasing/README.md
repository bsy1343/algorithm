# [Silver V] Chasing - 11249

[문제 링크](https://www.acmicpc.net/problem/11249)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 300, 정답: 59, 맞힌 사람: 42, 정답 비율: 18.834%

### 분류

수학, 애드 혹

### 문제 설명

<p>Tortoise and hare are chasing on circular race track of N section. Each section has a number start from 1, 2 &hellip; to N. (The section N is next to section 1.) This race track is oneway or in other word, if you are in section i, your next move will be going to section i+1 and if you are in section N, your next move will be going to section 1.</p>

<p>When the game starts, the hare is in section R and tortoise is in section T. In each turn, start with tortoise, tortoise will move for 1 section and hare will move for 2 sections. The game will end when tortoise and hare are in the same section. (The game can be ended even the hare has moved less than 2 section.) This game might take some time. You, as a referee, want to know how many turn will this game take. (1 turn includes moves of tortoise and hare. If tortoise and hare are in the same section at the start of the game, it takes 0 turns and the game ends immediately.)</p>

<p>Write a program that get a size of race track, starting position of tortoise and hare and find out how many turns will the game take.</p>

### 입력

<p>First line has a number K (1 &le; K &le; 100,000) represent number of test cases.</p>

<p>For next K lines, each line has three numbers N<sub>i</sub> R<sub>i</sub> T<sub>i</sub> (1 &le; N<sub>i</sub> &le; 10<sup>18</sup>, 1 &le; R<sub>i</sub>, T<sub>i</sub> &le; Ni) represent a size of race track, starting position of hare and tortoise in i-th test cases.</p>

### 출력

<p>Your output should have K lines. Each line represents the number of turns in i-th test cases.</p>