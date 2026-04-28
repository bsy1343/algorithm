# [Platinum III] Nautilus - 17184

[문제 링크](https://www.acmicpc.net/problem/17184)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 164, 정답: 65, 맞힌 사람: 51, 정답 비율: 55.435%

### 분류

비트 집합

### 문제 설명

<p>Nautilus is a secret submarine, sailing around the ocean and trying to remain hidden.</p>

<p>The ocean is modelled as R &times; C grid of cells, where &ldquo;#&rdquo; represents islands and &ldquo;.&rdquo; represents water. For example:</p>

<pre>
<img alt="" src="https://upload.acmicpc.net/b6caaee8-242c-4d1e-af1d-58956f59cd5c/-/preview/" style="width: 109px; height: 118px; float: right;" />...##....
..#.##..#
..#....##
.##...#..
....#....</pre>

<p>Every minute, Nautilus emits a radio signal that can reveal the direction the submarine is about to take. The direction is always one of the following: North (N), East (E), South (S), West (W), as shown on the figure above right.</p>

<p>Vytautas has constructed a radar that intercepts the periodic submarine signals. Over the last M minutes, the radar has collected M radio signals, represented as a sequence of M characters, for example &ldquo;WS?EE??&rdquo;. Some of the signals could not be decoded, these are marked as &ldquo;?&rdquo;.</p>

<p>Vytautas does not know the initial submarine location, but wants to use the ocean map in order to identify its current location. Given that Nautilus always stays in water cells on the map, help Vytautas calculate the number of distinct cells where Nautilus may be located at currently.</p>

### 입력

<p>The first line of the input contains three integers R, C, M.</p>

<p>The next R lines form an R &times; C grid of characters &ldquo;#&rdquo; and &ldquo;.&rdquo; representing the ocean map.</p>

<p>The last line of the input describes the signals intercepted by Vytautas &mdash; a string of M characters, all belonging to the set {N, E, S, W, ?}.</p>

### 출력

<p>Output a single integer: the number of possible distinct current positions of Nautilus.</p>