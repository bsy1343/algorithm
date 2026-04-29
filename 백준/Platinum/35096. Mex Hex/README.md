# [Platinum V] Mex Hex - 35096

[문제 링크](https://www.acmicpc.net/problem/35096)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 17, 맞힌 사람: 17, 정답 비율: 89.474%

### 분류

그리디 알고리즘

### 문제 설명

<p>The peace and quiet of your home city is being disturbed by the loud purrs and nightly creeping of a nearby magic bobcat. The mayor is sending you to scare it off -- you are the city's Guardian for Collateral, Personal, and other Catastrophic Damages after all. You take on the challenge and prepare for scaring away the magnificent animal.</p>

<p>To defend itself against you, the magic bobcat (as the name suggests) tries to hurt you in unconventional ways. When it attacks, it casts a number of magic <em>spells</em>. Each spell is cast with a particular <em>potential</em>, which can be expressed as a natural number.\footnote{For the purposes of this task, the natural numbers are defined as $\mathbb N = \{0, 1, 2, \dots\}$.} If you get hit with spells that have the potentials $p_1, p_2, \dots, p_n$, then the pain that you will feel from them is $\mathtt{mex}(\{p_1, p_2, \dots, p_n\})$, where $\mathtt{mex}$ denotes the Minimum Excluded Value.\footnote{Given a set $S \subseteq \mathbb N, S \ne \mathbb N$, $\mathtt{mex}(S)$ is the smallest number $m \in \mathbb N$ that is <em>not contained</em> in $S$.} Note that the spells do not hurt you immediately. Only after all spells are cast will you feel the pain based on the $\mathtt{mex}$ of their potentials.</p>

<p>To protect yourself, you bring a <em>shield</em> which can, also through magic, deflect the spells. Your shield has an <em>activation duration</em> $d$, which means that when you activate the shield, the next $d$ spells do not hit you. Afterwards, the shield must regenerate its magic and cannot be activated for the following $d$ spells. Apart from that, you can activate the shield as often as you want. To ensure that you give the magic bobcat a good scare, the mayor requested that you sneak up to it. As the bobcat would spot the glow of your activated magic shield, the earliest time you can activate the shield is when you stand before the culprit, right before it casts the first spell.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35096.%E2%80%85Mex%E2%80%85Hex/250668e3.png" data-original-src="https://boja.mercury.kr/assets/problem/35096-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px; height: 96px;"></p>

<p style="text-align: center;">Figure M.1: Illustration of Sample 3. The numbers in the boxes indicate the potentials of the spells. In this example, your shield's activation duration is $d = 2$. By activating the shield right before the 5th, 9th, and 14th spell, you block the spells underlined in green. You cannot activate your shield for the spells that are underlined with a dashed red line, because it is regenerating its magic at these times.</p>

<p>You must now devise a tactic to sustain as little pain as possible. From studying the previous encounters with magic bobcats, you know the potentials of the spells that will be cast against you. What is the minimum pain you can receive from them if you activate your shield optimally?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $n$ and $d$ ($1 \leq n \leq 10^5$, $1 \leq d \leq n$), the number of spells and the activation duration of your shield.</li>
<li>One line with $n$ integers $p_1, \dots, p_n$ ($0 \leq p_i &lt; n$), the potentials of the $n$ spells.</li>
</ul>

### 출력

<p>Output a single integer, the minimum pain you can receive from the spells.</p>