# [Platinum V] Alto Adaptation - 35192

[문제 링크](https://www.acmicpc.net/problem/35192)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

다이나믹 프로그래밍, 매개 변수 탐색, 이분 탐색

### 문제 설명

<p>It is always so frustrating when the song you want to sing is <em>just</em> outside the range of your beautiful alto singing voice\dots{} Thanks to music theory, a note outside your vocal range sounds similar to the intended note when you <em>transpose</em> it by one or multiple octaves up or down. However, just transposing a single note that is out of your range sounds weird: you would prefer to sing longer sequences of notes transposed by the same number of octaves.</p>

<p>To simplify some music theory, you represent the song as a sequence of numbers. Each number represents the <em>pitch</em> (or "height") of a music note. The span of your vocal range is represented by two numbers, and you can sing any note between these two endpoints (inclusive). There are twelve notes in an octave, so transposing a note by some number of octaves up or down makes this note some multiple of $12$ higher or lower than in the original song. You can switch between different transpositions at any point during the song. This divides the song into intervals of notes transposed by the same number of octaves. Your goal is to make the shortest such interval as long as possible. The original notes of the song can be treated as transposed by $0$ octaves.</p>

<p>As an example, consider the third sample case, visualized in Figure A.1. The first three notes comfortably fit in your vocal range. The subsequent three notes need to be transposed two octaves down to fit your vocal range. The next three notes should be transposed one octave down. The final two notes need to be transposed one octave up. So, the shortest interval of notes in the same transposition consists of the two notes at the end of the song.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with three integers $n$, $\ell$, and $h$ ($1\leq n\leq 1000$, $0 \leq \ell &lt; h &lt; 120$, $\ell + 11 \leq h$), the number of notes, and the low and high end of your vocal range (inclusive).</li>
<li>One line with $n$ integers $a$ ($0\leq a &lt; 120$), the notes in the song that you want to sing.</li>
</ul>

### 출력

<p>Output the maximum length of the shortest interval of notes that should be transposed by the same number of octaves to make them fit inside your vocal range.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35192.%E2%80%85Alto%E2%80%85Adaptation/49e5518a.svg" data-original-src="https://boja.mercury.kr/assets/problem/35192-1.svg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 350px; height: 554px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35192.%E2%80%85Alto%E2%80%85Adaptation/e4efe441.svg" data-original-src="https://boja.mercury.kr/assets/problem/35192-2.svg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 350px; height: 554px;"></p>

<p style="text-align: center;">Figure A.1: Illustration of the third sample case. The green shaded background corresponds to your vocal range. The blue notes are the notes in the original song. The red notes are sung one or two octaves higher or lower than in the original song.</p>