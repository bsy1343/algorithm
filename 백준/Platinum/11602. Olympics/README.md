# [Platinum I] Olympics - 11602

[문제 링크](https://www.acmicpc.net/problem/11602)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 36, 정답: 21, 맞힌 사람: 17, 정답 비율: 58.621%

### 분류

(분류 없음)

### 문제 설명

<p>The weightlifting event is up next at the Olympic games, and it&rsquo;s time to impress your fans! To accomplish your sequence of lift attempts, you have a constant strength S and a decreasing energy reserve E. For each attempt, you may choose any positive (not necessarily integer) weight W. If S &ge; W, the lift succeeds and your energy goes down by Esucc. If S &lt; W, the lift fails and your energy goes down by Efail. You may continue attempting lifts as long as E &gt; 0. If at any point E &le; 0, you can make no further attempts. Your score is the maximum weight in kg that you successfully lift, or 0 if all attempts failed.</p>

<p>Ideally, you should lift at exactly your strength limit. However, you do not know your strength. You only know that you can definitely lift the 25 kg Olympic bar, and that the maximum conceivable lift adds 100 kg on each side for a total of 225 kg. How close to an optimal score can you guarantee? That is, what&rsquo;s the smallest d for which you can ensure a score of at least S &minus; d?</p>

### 입력

<p>The input consists of a single line containing three space-separated integers E, E<sub>succ</sub>, and E<sub>fail</sub> (1 &le; E, E<sub>succ</sub>, E<sub>fail</sub> &le; 10<sup>7</sup>).</p>

### 출력

<p>Print, on a single line, the minimum d, rounded and displayed to exactly 6 decimal places.</p>