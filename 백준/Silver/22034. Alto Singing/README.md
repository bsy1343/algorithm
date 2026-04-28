# [Silver II] Alto Singing - 22034

[문제 링크](https://www.acmicpc.net/problem/22034)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 12, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p><a href="https://www.publicdomainpictures.net/se/view-image.php?image=279898"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22034.%E2%80%85Alto%E2%80%85Singing/751b45d8.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/22034.%E2%80%85Alto%E2%80%85Singing/751b45d8.png" data-original-src="https://upload.acmicpc.net/bc6bca59-d94c-4a66-a2b8-a1c77a88c2cf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 159px; float: right;" /></a>Anton is a famous choir singer in the <em>Kongliga Teknologk&ouml;ren</em>, the KTH choir. After years of careful political maneuvering, he managed to become the chairman of the choir. As such he has absolute power of what the choir does -- including what pieces to rehearse.</p>

<p>Anton has chosen a particular song he likes very much that he wants the choir to sing. There is only a slight problem -- the song is not at all suited for his particular vocal range. Anton has the <em>alto</em> vocal range, and wants to make sure that the most important part of the piece is perfect for his voice.</p>

<p>The piece is currently written down using the $12$ standard tones, in ascending order C, C#, D, D#, E, F, F#, G, G#, A, A#, B, each followed by an integer denoting the octave the tone appears in. The lowest octave is $1$. Immediately after the B tone of octave $i$, the C tone of octave $i + 1$ follows.</p>

<p>Now, Anton wants to <em>transpose</em> the piece so that all tones in the part are within his vocal range, which is given by the lowest and highest tone he can sing. Transposing means that all tones are shifted either up or down by some fixed number of tones. For example, C#4 (C# in the fourth octave) transposed $5$ tones down would be G#3. Furthermore, Anton is not very good at reading sheet music. Among all valid transpositions, he is only interested in the ones that minimize the number of tones with accidentals (that is, those with a # sign)<sup>1</sup>.</p>

<p>Given the piece and Anton&#39;s vocal range, can you determine how many such transpositions there are?</p>

<p><sup>1</sup>For those of you who know music, Anton finds writing down a key for the piece other than C major even more confusing, since he must then remember what tones should be raised or lowered throughout the piece.</p>

### 입력

<p>The first line of input contains the number of tones $n$ ($1 \le n \le 1000$) in the piece. &nbsp;Then follows a line containing two tones, the lowest and the highest tone that Anton can sing (in that order).</p>

<p>The third and final line contains the tones that Anton&#39;s piece consists of. The same tone may appear multiple times in the piece. It is guaranteed that Anton can sing at least one transposition of the piece.</p>

<p>Each tone is written as one of the $12$ tones C, C#, D, D#, E, F, F#, G, G#, A, A#, B followed immediately by its octave without any space in between. Only octaves between $1$ and $10^9$ are used<sup>2</sup>.</p>

<p><sup>2</sup>Possibly only after centuries of vocal exercises.</p>

### 출력

<p>Output a single line with two integers -- the minimum number of accidentals (notes with #) among all transpositions, and the number of transpositions that keeps the piece in Anton&#39;s vocal range and has the minimum number of accidentals. If the piece is already in Anton&#39;s vocal range, the transposition of $0$ tones should be counted as well (if that minimizes accidentals).</p>