# [Silver IV] Array of Discord - 21047

[문제 링크](https://www.acmicpc.net/problem/21047)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 180, 정답: 81, 맞힌 사람: 72, 정답 비율: 46.753%

### 분류

브루트포스 알고리즘, 해 구성하기

### 문제 설명

<p>Once upon a time, high up on Mount Olympus, it came to pass that the gods held a competition to see who among them was the best at sorting lists of integers. &nbsp;Eris, the goddess of discord, finds this terribly boring and plans to add some mischief to the mix to make things more fun. &nbsp;She will sabotage the answers of Zeus so that his list of numbers is no longer sorted, which will no doubt be so embarrassing that he becomes furious and starts a minor war.</p>

<p>Eris must be careful not to be discovered while performing her sabotage, so she decides to only change a single digit in one of the numbers in Zeus&#39; answer. &nbsp;The resulting number may not have any leading zeros (unless it becomes equal to zero in which case a single zero digit is allowed). &nbsp;Eris can only replace a digit with another digit -- adding or removing digits is not allowed.</p>

### 입력

<p>The first line of input contains $n$ ($2 \leq n \leq 100$), the length of Zeus&#39; answer. &nbsp;The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \leq a_1 \le a_2 \le \ldots \le a_n \leq 10^{15}$), Zeus&#39; answer.</p>

### 출력

<p>If Eris can make the list not be sorted by changing a single digit of one of the numbers, then output $n$ integers $b_1, \ldots, b_n$, the resulting list of numbers after making the change. &nbsp;Otherwise, output &quot;<code>impossible</code>&quot;. &nbsp;If there are many valid solutions, any one will be accepted.</p>