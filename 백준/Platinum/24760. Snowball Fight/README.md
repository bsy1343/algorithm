# [Platinum I] Snowball Fight - 24760

[문제 링크](https://www.acmicpc.net/problem/24760)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

많은 조건 분기, 수학

### 문제 설명

<p>\textit{Back in my day, we were allowed to have snowball fights during recess. Me and my two friends would split up, build a fort, and stock it with snowballs. When the fighting started, we threw snowballs at each other&#39;s forts until there was one left standing. Those were the days.}</p>

<p>There are three forts labelled <code>A</code>, <code>B</code>, and <code>C</code> that appear in a circle: with <code>B</code> to the left of <code>A</code>, <code>C</code> to the left of <code>B</code>, and <code>A</code> to the left of <code>C</code>.</p>

<p>The strengths of the forts are represented as nonnegative integers. If the strength of a fort is $0$, then it is just rubble and the person in that fort no longer throws snowballs.</p>

<p>The fight proceeds in rounds. Each round, each person in a non-rubble fort picks a target. Their target is the fort with highest strength, apart from their own. If both possible targets have the same strength, the person chooses the fort on their left as the target. The people then simultaneously throw a single snowball at their chosen target. Each snowball reduces the strength of the target fort by $1$. This repeats until there is at most one fort that is not reduced to rubble.</p>

<p>Given the initial strengths of the three forts, you are to determine if there is a fort that is not reduced to rubble and, if so, the remaining strength of that fort.</p>

### 입력

<p>Input contains a single line containing three integers $N_A$ ($1 \leq N_A \leq 10^{18}$), which is the initial strength of fort <code>A</code>, $N_B$ ($1 \leq N_B \leq 10^{18}$), which is the initial strength of fort <code>B</code>, and $N_C$ ($1 \leq N_C \leq 10^{18}$), which is the initial strength of fort <code>C</code>.</p>

### 출력

<p>If all forts are reduced to rubble, display <code>Rubble!</code>. Otherwise, display <code>A</code>, <code>B</code>, or <code>C</code> indicating which fort was left standing followed by the remaining strength of that fort.</p>