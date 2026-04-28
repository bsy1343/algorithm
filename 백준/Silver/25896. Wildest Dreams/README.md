# [Silver I] Wildest Dreams - 25896

[문제 링크](https://www.acmicpc.net/problem/25896)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 20, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

구현, 시뮬레이션, 많은 조건 분기

### 문제 설명

<p>Secretly, Arup loves Taylor Swift&#39;s music. He covers for his addiction by claiming that Anya, his three-year-old daughter, forces him to play the Taylor Swift CD in the car whenever she&#39;s in it. The reality is that Arup also listens to the CD even when Anya isn&#39;t in the car.</p>

<p>Both of them have peculiar listening habits. Anya typically obsesses over a single song and will request that Arup play that song on infinite repeat while she is in the car. For example, the current song Anya is obsessed with is track 9, Wildest Dreams. So, when Anya enters the car, Arup immediately starts playing track 9 (from the beginning of the track) and this song is played repeatedly. Arup, however, wants to listen to the whole CD and not just one track repeatedly. So, whenever Anya exits the car, Arup just lets the CD play in its natural ordering (tracks play in order and when the end of the CD is reached, track 1 starts again). If Anya exits the car in the middle of her favorite song playing, Arup just lets it continue to play that track until its end and then advances to the next song. For our example, if Anya exits the car in the middle of track 9, Arup lets track 9 continue until its end and then advance to the next song (track 10 or if track 9 is the end of CD, track 1).</p>

<p>Arup is curious exactly how long he has listened to Anya&#39;s favorite song. Given a list of the lengths of each song, when Anya is in the car and the song Anya is obsessed with, calculate the amount of time Arup has to hear the song that Anya is obsessed with. Recall that when Anya enters the car, her song is played from the beginning and the song keeps repeating as long as Anya is in the car. You may assume that if Anya gets out of the car in the middle of Anya&#39;s song playing, Arup will continue listening to it instead of forwarding the CD to the next song but when Anya&rsquo;s song is finished the next song will continue. If Anya&rsquo;s song ends exactly when Anya is leaving the car, the next song will continue, i.e., Anya&rsquo;s song does not loop back to the beginning.</p>

<p>Since Anya changes which CD she&#39;s obsessed with periodically, write a program that can solve multiple instances of the problem.</p>

### 입력

<p>The first line of input will contain a single positive integer, n (1 &le; n &le; 50), representing the number of CDs Anya has been obsessed with.</p>

<p>The first line of input for each CD will contain two integers: t (1 &le; t &le; 20), the number of tracks on the CD, and k (1 &le; k &le; t), the track that Anya is obsessed with. The second line of input for each CD contains t space separated positive integers representing the lengths of each of the t tracks on the CD, in order, in seconds. No CD will be more than 86,400 seconds in length. The third line of input for each CD contains a single positive integer, d (1 &le; d &le; 100), the number of days to evaluate. The following d lines contain information about each day. Each of these lines will start with an integer, s<sub>i</sub> (1 &le; s<sub>i</sub> &le; 20), the number of segments of driving for day i. This is followed by s<sub>i</sub> positive integers, representing the lengths of each of the driving segments, in seconds. Assume that Anya is in the car for the odd-number segments (first, third, fifth, etc.) The sum of the lengths of each driving segment will never exceed 86,400, the number of seconds in a day.</p>

### 출력

<p>At the beginning of each CD, on a single line, output &ldquo;CD #c:&rdquo; where c is the CD number (starting with 1). Then, on the following d lines, where d represents the number of days that CD was played, output the number of seconds Arup listed to Anya&#39;s favorite song on the CD, for each day, respectively. Leave a blank line after the output for each CD.</p>