# [Platinum III] Jigglypuff - 18628

[문제 링크](https://www.acmicpc.net/problem/18628)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 45, 맞힌 사람: 44, 정답 비율: 39.640%

### 분류

애드 혹

### 문제 설명

<p>Your ACM team has gathered in a picturesque city of Petrozavodsk for a team-building camp. You&rsquo;ve heard that just outside of the city there is a Jigglypuff field that might help you make stronger bonds with your teammates, so you&rsquo;re definitely giving it a try.</p>

<p>The field is a rectangle partitioned into n &middot; m squares grouped into n rows and m columns. Each square contains a single Jigglypuff, which produces a note when a team member steps on its cell. Each note can be described by a single lowercase English character.</p>

<p>You and your two teammates will stand in the top-left corner of the field. Each of you will then go to the bottom-right corner, moving only right and down. Each of you has to pick a different route through the field.</p>

<p>Jigglypuff have psychic abilities. Therefore, if each of you hears exactly the same sequence of notes when passing through the field, your brains will perfectly synchronize and the team-building exercise will be complete. Is it possible to do so?</p>

### 입력

<p>The first line contains two integers n, m (2 &le; n, m &le; 3000) &mdash; the height and the width of the field. The following n lines describe the field. Each of these lines contains a single string of length m consisting of lowercase English characters. The first character in the first line is the top-left corner of the field.</p>

### 출력

<p>Output YES if it&rsquo;s possible to hear the same sequence of notes on at least three different routes through the grid, or NO otherwise. Each character can be printed in any case (either uppercase or lowercase).</p>

### 힌트

<p>The following picture shows the first example test and three paths generating the same sequence of notes &mdash; <code>petrozavodsk</code>:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18628.%E2%80%85Jigglypuff/34af741a.png" data-original-src="https://upload.acmicpc.net/1dc563a2-c450-4975-b85f-8e6d284e11c9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 314px;" /></p>