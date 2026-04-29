# [Silver III] Out of Bounds Piano - 35010

[문제 링크](https://www.acmicpc.net/problem/35010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Your friend Gassassini Pianini is learning to play the piano. He has a piano at home with a standard layout of 88 keys:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35010.%E2%80%85Out%E2%80%85of%E2%80%85Bounds%E2%80%85Piano/bb88fbc5.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35010-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 640px; height: 83px;"></p>

<p>In this problem, we will only be interested in the 52 white keys. They are named consecutively with the letters of the English alphabet A--G in a cycle of length seven (called an <em>octave</em>), as shown in the image.</p>

<p>Gassassini Pianini has obtained the scores of several musical pieces by the violinist Paganini and wants to transpose them for the piano. For each piece, he has already decoded the musical notation and obtained a string of letters A--G that constitutes the melody. Now he wants to play the pieces on the piano, and he does not care from which octave a particular note is taken: for example, if the string indicates that the next note is A, he will be satisfied with any of the eight A notes available on the piano.</p>

<p>The problem is that Gassassini Pianini is still inexperienced and cannot stretch his fingers too wide. He can choose the first note freely (from the available keys with the required letter); however, for each subsequent note, he can only play one that is at most three keys away from the previous one in either direction. For example, suppose the last note played was the dark gray D in the illustration above; then the next note can either be exactly that same D or one of the six light gray notes in its vicinity.</p>

<p>You are given string transcriptions of several musical pieces that interest Gassassini Pianini; determine whether he will be able to play them or if he needs to practice finger positioning.</p>

### 입력

<p>The first line contains an integer $t$: the number of musical pieces ($1 \le t \le 10^4$).</p>

<p>Each of the following $t$ lines contains a non-empty string $s_i$ of uppercase English letters \mbox{A--G}: the transcription of a musical piece. The total number of letters in all transcriptions is at most $2 \cdot 10^5$.</p>

### 출력

<p>For each of the $t$ strings, print "<code>Yes</code>" if Gassassini Pianini can play the piece on the piano, and "<code>No</code>" if it is impossible. Print each answer on a separate line. You may choose the case of the letters you print arbitrarily; in other words, the checking program does not care which of your letters are uppercase and which are lowercase.</p>