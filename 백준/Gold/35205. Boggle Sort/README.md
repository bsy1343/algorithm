# [Gold II] Boggle Sort - 35205

[문제 링크](https://www.acmicpc.net/problem/35205)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>It is the 25th of February, 2025. You have enjoyed another spirited evening of <em>Boggle</em> with your friends. After everybody left, you have thoroughly cleaned the apartment. All that is left is to bring the Boggle tray in order. You start to wonder: would it be possible to bring the Boggle tray in alphabetic order, without swapping any dice, but only by rotating them?</p>

<p>The Boggle tray consists of $16$ six-sided dice. Each die is labelled with a letter from the English alphabet on each face. A single die contains a face labelled "Qu". No letter appears $4$ or more times on the same die. By turning a die once, you can move any of the sideways-facing letters up. Turning a die twice moves the downwards-facing letter up.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35205.%E2%80%85Boggle%E2%80%85Sort/9e5429f3.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35205-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 463px;"></p>

<p style="text-align: center;">Figure B.1: Visualization of the first sample input. The $16$ Boggle dice are shown in reading order. For each die, the face in the center of the cross ("I" in the first die) is upwards-facing and the face on the far right ("Y" in the first die) is downwards-facing. The shaded die faces describe an optimal solution requiring $15$ turns.</p>

<p>Bring the tray into alphabetically nondecreasing order, using standard reading directions (left-to-right, top-to-bottom), using as few turns as possible. Letter case plays no role and the two-letter face is treated as "Q" followed by "U", so "QuU" is sorted but "QuT" is not.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with $16$ letters, describing the currently upwards-facing faces of each die.</li>
<li>Four lines with $16$ letters, describing the currently sideways-facing faces of each die.</li>
<li>One line with $16$ letters, describing the downwards-facing faces of each die.</li>
</ul>

<p>In each line, the $i$th letter describes the $i$th die for $1\leq i\leq 16$. All letters are English uppercase letters (<code>A-Z</code>). The letter "<code>Q</code>" stands for the two-letter face "Qu" and appears exactly once in the input. No letter appears $4$ or more times on the same die.</p>

### 출력

<p>If it is possible to bring the tops of the dice into alphabetic order, output the minimum number of turns needed to do so. Otherwise, output "<code>impossible</code>".</p>