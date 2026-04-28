# [Gold I] Magic Slayer - 22615

[문제 링크](https://www.acmicpc.net/problem/22615)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 7, 맞힌 사람: 5, 정답 비율: 27.778%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>You are in a fantasy monster-ridden world. You are a slayer fighting against the monsters with magic spells.</p>

<p>The monsters have&nbsp;<i>hit points</i>&nbsp;for each, which represent their vitality. You can decrease their hit points by your magic spells: each spell gives certain points of&nbsp;<i>damage</i>, by which monsters lose their hit points, to either one monster or all monsters in front of you (depending on the spell). Monsters are defeated when their hit points decrease to less than or equal to zero. On the other hand, each spell may consume a certain amount of your&nbsp;<i>magic power</i>. Since your magic power is limited, you want to defeat monsters using the power as little as possible.</p>

<p>Write a program for this purpose.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset has the following format:</p>

<pre>
<i>N</i>
<i>HP</i><sub>1</sub>
<i>HP</i><sub>2</sub>
...
<i>HP</i><sub><i>N</i></sub>
<i>M</i>
<i>Name</i><sub>1</sub> <i>MP</i><sub>1</sub> <i>Target</i><sub>1</sub> <i>Damage</i><sub>1</sub>
<i>Name</i><sub>2</sub> <i>MP</i><sub>2</sub> <i>Target</i><sub>2</sub> <i>Damage</i><sub>2</sub>
...
<i>Name</i><sub><i>M</i></sub> <i>MP</i><sub><i>M</i></sub> <i>Target</i><sub><i>M</i></sub> <i>Damage</i><sub><i>M</i></sub></pre>

<p><i>N</i>&nbsp;is the number of monsters in front of you (1 &le;&nbsp;<i>N</i>&nbsp;&le; 100);&nbsp;<i>HP<sub>i</sub></i>&nbsp;is the hit points of the&nbsp;<i>i</i>-th monster (1 &le;&nbsp;<i>HP<sub>i</sub></i>&nbsp;&le; 100000);&nbsp;<i>M</i>&nbsp;is the number of available magic spells (1 &le;&nbsp;<i>M</i>&nbsp;&le; 100);&nbsp;<i>Name<sub>j</sub></i>&nbsp;is the name of the&nbsp;<i>j</i>-th spell, consisting of up to 16 uppercase and lowercase letters;&nbsp;<i>MP<sub>j</sub></i>&nbsp;is the amount of magic power consumed by the&nbsp;<i>j</i>-th spell (0 &le;&nbsp;<i>MP<sub>j</sub></i>&nbsp;&le; 99);&nbsp;<i>Target<sub>j</sub></i>&nbsp;is either &quot;Single&quot; or &quot;All&quot;, where these indicate the&nbsp;<i>j</i>-th magic gives damage just to a single monster or to all monsters respectively;&nbsp;<i>Damage<sub>j</sub></i>&nbsp;is the amount of damage (per monster in case of &quot;All&quot;) made by the&nbsp;<i>j</i>-th magic (0 &le;&nbsp;<i>Damage<sub>j</sub></i>&nbsp;&le; 999999).</p>

<p>All the numbers in the input are integers. There is at least one spell that gives non-zero damage to monsters.</p>

<p>The last dataset is followed by a line containing one zero. This line is not a part of any dataset and should not be processed.</p>

### 출력

<p>For each dataset, Print in a line the minimum amount of magic power consumed to defeat all the monsters in the input.</p>