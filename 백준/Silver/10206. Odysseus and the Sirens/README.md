# [Silver IV] Odysseus and the Sirens - 10206

[문제 링크](https://www.acmicpc.net/problem/10206)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 13, 정답 비율: 68.421%

### 분류

구현, 문자열, 브루트포스 알고리즘, 파싱

### 문제 설명

<p>Odysseus is one of the best-known Greek heroes, the subject of a famous books by Homer; his story forms the basis of many other literary works. He spent many years after the Trojan War lost at sea, involved in multiple shipwrecks, fights against various monsters, and was the object of love of several rather deranged women, among others. One of the famous episodes of his story is passing the land of the Sirens by ship. The Sirens sang such enchanting songs that sailors would invariably steer toward their rocks, hit them, and sink. Odysseus had been warned by Circe (one of his unrequited lovers), but was curious to hear the Sirens&rsquo; songs. So he had his men firmly tie him to the boat&rsquo;s mast, had them put wax in their own ears, and instructed them to not untie him under any circumstances.</p>

<p>Probably, one of the main reasons why Odysseus was so intent on hearing the Sirens&rsquo; songs was because he wanted to musically analyze the tonal language. We will help him, by writing a program that figures out the most likely key for a sequence of notes to be in.3 You will be given a table of which notes are how &ldquo;likely&rdquo; in each key (in the form of penalty scores). Then, you will be given a sequence of melodies, and for each, you are supposed to determine the key that fits the melody best.</p>

<p>The 12 musical notes are, in order, C, C#, D, D#, E, F, F#, G, G#, A, A#, B. For each of these notes, there are major and minor keys, but also modal keys (which were probably more common in Odysseus&rsquo;s time anyway). So you don&rsquo;t need to know what typical major or minor keys look like.</p>

<p><sup>3</sup>In reality, you would want to consider a piece of music and its key changes along the way, but that may be a bit much here.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains two integers 1 &le; n, m &le; 100, separated by a space. n is the number of keys that you will choose from, and m is the number of melodies you will be given.</p>

<p>Next come n lines, each describing a key. Each such line contains 12 floating point numbers, the penalties of seeing the corresponding note in this key.</p>

<p>Next come m lines, each a string of at most 100 characters, the sequence of notes of the melody. It will only consist of upper-case characters and the # sign, as described above; there will be no spaces, and only legal notes will occur (i.e., no &ldquo;E#&rdquo; or &ldquo;B#&rdquo;).</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then output, for each melody on a line by itself, the number of the key that best fits that melody, in that it minimizes the cumulative penalty. We will make sure that there are no ties, i.e., each melody will have a unique best fit.</p>

<p>Each data set should be followed by a blank line.</p>