# [Silver V] Lightning Lessons - 4452

[문제 링크](https://www.acmicpc.net/problem/4452)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 44, 맞힌 사람: 36, 정답 비율: 50.704%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Zeus wrung his hands nervously. &ldquo;I&rsquo;ve come to you because I agreed to duel Thor in the upcoming Godfest. You&rsquo;re good in a fight, Raiden; you&rsquo;ve got to help me!&rdquo;</p>

<p>Raiden, smiling thinly beneath the rim of his hat, replied, &ldquo;What help could I provide a god as mighty as yourself? Your thunderbolts are the stuff of legends!&rdquo; Zeus looked down and stammered, &ldquo;I&rsquo;ve. . . I&rsquo;ve been lucky. I don&rsquo;t know how the thunderbolts actually work. Sometimes I turn my foe into a charred heap, but other times. . . weird stuff happens. If Apollo hadn&rsquo;t convinced the bards to keep my secret, I&rsquo;d be a laughingstock.&rdquo;</p>

<p>Raiden raised his eyebrows and asked, &ldquo;Weird stuff?&rdquo; Zeus looked up and took a deep breath. &ldquo;Sometimes it just fizzles out. Other times it rolls up and turns into a. . . a bunny.&rdquo; Raiden burst out laughing. &ldquo;A bunny! That&rsquo;s some chi you&rsquo;ve got there.&rdquo; As Zeus began to redden, Raiden held up his hand and said, &ldquo;Don&rsquo;t worry, I&rsquo;ll help you out.&rdquo;</p>

<p>Raiden went on to explain. &ldquo;A thunderbolt is a sequence of chi pivots, or &lsquo;zigs and zags&rsquo; as the mortals call them. Each pivot has an integer amplitude&mdash;&rdquo;</p>

<p>&ldquo;Yes, I know that much.&rdquo;, Zeus interrupted. &ldquo;But lightning is lively and unpredictable. The amplitudes go all random once the bolt hits!&rdquo;</p>

<p>&ldquo;Not all that flickers is flame. If you watch the bolt closely, you&rsquo;ll see it goes through &lsquo;cycles&rsquo;, and gets shorter by one pivot each cycle. When the bolt cycles, each successive pivot&rsquo;s amplitude is decreased by the amplitude of its predecessor from the end of the previous cycle, and the first pivot vanishes. If a bolt ever reaches a state of all zero amplitudes, it converges and zaps its target with power proportional to the number of preceding cycles. Your &lsquo;weird stuff&rsquo; happens only when a bolt cycles down to a single non-zero amplitude. A positive amplitude just fizzles out into waste heat, but negative amplitudes produce odd low-entropy states. It&rsquo;s the latter you&rsquo;ve seen hopping away in the midst of battle.&rdquo;</p>

<p>Help Zeus avoid embarrassment by writing a program that predicts how powerful a given bolt will be if it converges, or what will happen to it if it diverges.</p>

### 입력

<p>The first line of input contains a single positive integer N which denotes how many lightning bolts follow. Each bolt is specified by a line beginning with an integer M (0 &lt; M &le; 20), followed by M space-delimited integers denoting the initial amplitudes of each successive pivot. No initial amplitude will have an absolute value larger than 1000.</p>

### 출력

<p>For each bolt that converges, output the letter &ldquo;z&rdquo; repeated P times, where P is the number of cycles encountered before the bolt converges, followed by the string &ldquo;ap!&rdquo; (the all-zero cycle does not count toward P).</p>

<p>For each bolt that fails to converge, output &ldquo;*fizzle*&rdquo; if the final amplitude was positive, &ldquo;*bunny*&rdquo; if it was negative.</p>