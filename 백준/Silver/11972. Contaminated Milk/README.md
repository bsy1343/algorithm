# [Silver III] Contaminated Milk - 11972

[문제 링크](https://www.acmicpc.net/problem/11972)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1396, 정답: 405, 맞힌 사람: 331, 정답 비율: 30.648%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Farmer John, known far and wide for the quality of the milk produced on his farm, is hosting a milk-tasting party for \(N\) of his best friends (\(1 \leq N \leq 50\)). Unfortunately, of the \(M\) types of milk featured at the party (\(1 \leq M \leq 50\)), exactly one of them has gone bad, but Farmer John does not know which one! Anyone who drinks the bad milk will later become sick, either during the remainder of the party or afterward.</p>

<p>You are given a transcript of the party -- who drinks what when, and also who gets sick when. Based on this information, you can deduce which of the milks could possibly be the bad one. Using this knowledge, help Farmer John determine the minimum number of doses of medicine he will need to obtain in order to guarantee that he can cure all of the individuals who become sick, either during or after the party.</p>

### 입력

<p>The first line of the input contains integers \(N\), \(M\), \(D\), and \(S\).</p>

<p>The next \(D\) lines (\(1 \leq D \leq 1000\)) each contain three integers \(p, m, t\), indicating that person \(p\) drank milk \(m\) at time \(t\). The value of \(p\) is in the range \(1 \ldots N\), \(m\) is in the range \(1 \ldots M\), and \(t\) is in the range \(1 \ldots 100\). A person may drink the same milk several times, and may also drink several types of milk at the same point in time.</p>

<p>The next \(S\) lines (\(1 \leq S \leq N\)) each contain two integers \(p, t\), indicating that person \(p\) gets sick at time \(t\). The value of \(p\) is in the range \(1 \ldots N\), and \(t\) is in the range $1 \ldots 100$. Each person gets sick at most once, and they only get sick because they drank the bad milk at some strictly earlier point in time.</p>

### 출력

<p>A single integer, specifying the minimum number of doses of medicine Farmer John needs to obtain so that he can guarantee that he will have sufficiently many doses to treat all the people who become sick, both during and after the party.</p>

### 힌트

<p>There are 3 people and 4 milk types. Person 1 gets sick at time 3 and person 2 gets sick at time 8. Person 3 does not get sick at the party, although we may still need to consider the possibility that he could become sick later, after the party ends. Let&#39;s consider the milk types one by one to see which ones could be contaminated; we know a milk type is potentially bad if everyone who became sick drank that milk type before becoming sick.</p>

<p>Milk 1: Both of the sick people (1 and 2) drank this milk before getting sick, so this could be the bad milk. If so, person 3 also drank it, so it would cause a total of 3 people to get sick (person 3 would become sick after the party).</p>

<p>Milk 2: Both of the sick people drank this milk before getting sick, so this could also be the bad milk. Nobody else drank this milk, so at worst 2 total people could be sick if this is the bad milk.</p>

<p>Milk 3: This cannot be the bad milk because person 1 did not drink it before getting sick -- person 1 drank it at time 4, and got sick at time 3. For milk 3 to be implicated in person 1 getting sick, person 1 would have needed to drink this milk by time 2 at the latest.</p>

<p>Milk 4: This cannot be the bad milk because person 2 did not drink it, and yet person 2 became sick.</p>

<p>The answer is therefore that Farmer John must obtain 3 doses of medicine, since if milk 1 is bad, then a total of 3 people will need to be cured.</p>