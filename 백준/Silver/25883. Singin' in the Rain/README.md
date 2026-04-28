# [Silver V] Singin' in the Rain - 25883

[문제 링크](https://www.acmicpc.net/problem/25883)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 31, 맞힌 사람: 28, 정답 비율: 71.795%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>During the time of the 2016 UCF Local Programming Contest, Arup&#39;s younger daughter Anya (3 years old at the time), made Arup incessantly listen to Taylor Swift&#39;s song &quot;Wildest Dreams&quot;. A full year later, we are proud to report that Anya&#39;s listening habits have matured greatly. Rather than wanting to hear the same song over and over again, Anya has embraced an embryonic notion of diversity in music. Now, she wants to hear various different tracks, in sequence, all from the same CD.</p>

<p>This year, it turns out that Anya&#39;s favorite CD is &quot;Singing in the Rain&quot;, which her older sister Simran obtained when she performed in the &quot;Singing in the Rain&quot; production at a local theater. Whenever Anya is in the car with Arup, she&#39;ll listen to a track and then call out the number of the next track that she wants to listen to. The problem is that Arup&#39;s car has a rather primitive CD player:</p>

<ul>
	<li>If track number k has completed, then track k+1 will play. If track k is the last track on the CD, the CD will wrap around and track 1 will play.</li>
	<li>Arup can also change tracks by pressing a forward button. If track number k has completed, if Arup presses the forward button, then track k+2 will play. If k is the last track and Arup presses forward when k finishes, the CD will wrap around and track 2 will play next. If k is next to the last track and Arup presses forward when k finishes, track 1 will play next.</li>
	<li>Arup can also change tracks by pressing a backward button. If track number k has completed, if Arup presses the backward button, track number k will play again. If k is the first track and Arup presses the backward button twice right after track 1 completes, the CD will wrap around and track t will play next, where t is the number of tracks on the CD.</li>
</ul>

<p>This means Arup is pressing either the forward or backward button a great deal. Help him minimize the number of times he presses the buttons.</p>

<p>Given the number of tracks on Anya&#39;s favorite CD and the sequence of tracks Anya wants to be played, determine the minimum number of button presses Arup must make to get the appropriate sequence of songs played. For the purposes of this problem, assume that at the very beginning the CD player is cued up to play the first song in the sequence (the first song Anya wants to be played), so Arup does not have to press any buttons for the first song in the sequence to be played, i.e., the first time any buttons might have to be pressed is in between the first and second songs in the sequence (after the first song in the sequence plays).</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of test cases to process. Each test case starts with two space separated integers on a single line: t (1 &le; t &le; 10<sup>9</sup>), the number of tracks on Anya&#39;s favorite CD and s (1 &le; s &le; 1000), the number of songs Anya would like to listen to from the CD. The second line of each test case contains s space separated integers, representing the sequence of tracks from the CD that Anya would like to listen to. Each of these will be in between 1 and t, inclusive.</p>

### 출력

<p>For each test case, output a single integer on a line by itself indicating the minimum number of button presses Arup can use to play the desired sequence of songs from the CD.</p>

### 힌트

<p>In Case #1, we first push the backwards button 11 times after 67 completes to cue up 57. Then we press the forward button 8 times to get 66 cued up after 57 finishes. After 66 finishes, we press no buttons and let 67 play, followed by pressing the backward button 20 times to arrive at track 48. Finally, we can either press the backward button 34 times to get to 15 or the forward button 34 times to get to 15. Thus, the minimal number of button presses is 11 + 8 + 0 + 20 + 34 = 73.</p>

<p>In Case #2, we must either press the forward or backward button 500,000,000 times between each pair of consecutive songs on the list.</p>

<p>In Case #3, we must press the backward button once in between track 1 playing the first time and the second time.</p>