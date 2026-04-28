# [Silver I] Minor Setback - 31043

[문제 링크](https://www.acmicpc.net/problem/31043)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 16, 맞힌 사람: 14, 정답 비율: 63.636%

### 분류

수학, 구현, 자료 구조, 정수론, 집합과 맵, 많은 조건 분기, 해시를 사용한 집합과 맵

### 문제 설명

<p>You are developing a smartphone app that converts audio recorded from an instrument into sheet music. You already have the code to record the audio and convert it into sequence of frequency values. What is left is to translate those frequencies into pitch names more easily recognizable to musicians.</p>

<p>Some Music Theory</p>

<p>Musical pitches are described by frequencies using a logarithmic scale. The frequency $440\ \textrm{Hz}$ corresponds to the pitch named $\textrm{A}$. Multiplying a pitch&rsquo;s frequency by $\sqrt [12]{2}$ produces the next higher pitch. Table 1 lists pitches used in Western music and their frequencies.</p>

<div class="table" id="minorsetback:pitchnames">
<center>
<div class="caption"><b>Table 1</b>: Frequencies and corresponding pitch names of various notes.</div>

<table cellspacing="0" class="tabular table table-bordered">
	<tbody>
		<tr>
			<td style="text-align:center; border-right:1px solid black">
			<p>frequency (Hz)</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>pitch name</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>frequency (Hz)</p>
			</td>
			<td style="text-align:center">
			<p>pitch name</p>
			</td>
		</tr>
		<tr>
			<td style="border-top-style:solid; text-align:center; border-top-color:black; border-top-width:1px; border-right:1px solid black">
			<p>$440$</p>
			</td>
			<td style="border-top-style:solid; text-align:center; border-top-color:black; border-top-width:1px; border-right:1px solid black">
			<p>$\textrm{A}$</p>
			</td>
			<td style="border-top-style:solid; text-align:center; border-top-color:black; border-top-width:1px; border-right:1px solid black">
			<p>$440 \cdot 2^{6/12} \approx 622.25$</p>
			</td>
			<td style="border-top-style:solid; border-top-color:black; border-top-width:1px; text-align:center">
			<p>$\textrm{D}^{\sharp }$, $\textrm{E}^{\flat }$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{1/12} \approx 466.16$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$\textrm{A}^{\sharp }$, $\textrm{B}^{\flat }$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{7/12} \approx 659.26$</p>
			</td>
			<td style="text-align:center">
			<p>$\textrm{E}$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{2/12} \approx 493.88$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$\textrm{B}$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{8/12} \approx 698.46$</p>
			</td>
			<td style="text-align:center">
			<p>$\textrm{F}$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{3/12} \approx 523.25$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$\textrm{C}$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{9/12} \approx 739.99$</p>
			</td>
			<td style="text-align:center">
			<p>$\textrm{F}^{\sharp }$, $\textrm{G}^{\flat }$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{4/12} \approx 554.37$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$\textrm{C}^{\sharp }$, $\textrm{D}^{\flat }$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{10/12} \approx 783.99$</p>
			</td>
			<td style="text-align:center">
			<p>$\textrm{G}$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{5/12} \approx 587.33$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$\textrm{D}$</p>
			</td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$440 \cdot 2^{11/12} \approx 830.61$</p>
			</td>
			<td style="text-align:center">
			<p>$\textrm{G}^{\sharp }$, $\textrm{A}^{\flat }$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:center; border-right:1px solid black"> </td>
			<td style="text-align:center; border-right:1px solid black"> </td>
			<td style="text-align:center; border-right:1px solid black">
			<p>$880$</p>
			</td>
			<td style="text-align:center">
			<p>$\textrm{A}$</p>
			</td>
		</tr>
	</tbody>
</table>
</center>
</div>

<p>Doubling any pitch&rsquo;s frequency yields the same pitch, but one octave higher (note that both $440$ and $880\ \textrm{Hz}$ correspond to pitch $\textrm{A}$). This rule generalizes: multiplying $554.37\ \textrm{Hz}$ by a power of two yields another $\textrm{C}^{\sharp }$. Some pitches have multiple names, as shown in the table.</p>

<p>Your Task</p>

<p>You have a song, represented as a sequence of frequencies. Songs in a <em>musical key</em> typically contain only a subset of the possible pitches. Assume that the given song is in one of the common keys listed in Table 2. First, determine what key the song is in. Then, translate the song into a sequence of pitch names.</p>

<div class="table" id="minorsetback:keys">
<center>
<div class="caption"><b>Table 2</b>: A few musical keys and the pitches they use.</div>

<table cellspacing="0" class="tabular table table-bordered">
	<tbody>
		<tr>
			<td style="text-align:left; border-right:1px solid black">
			<p>key name</p>
			</td>
			<td style="text-align:left; border-right:1px solid black">
			<p>allowed pitches</p>
			</td>
			<td style="text-align:left; border-right:1px solid black">
			<p>key name</p>
			</td>
			<td style="text-align:left">
			<p>allowed pitches</p>
			</td>
		</tr>
		<tr>
			<td style="border-top-style:solid; text-align:left; border-top-color:black; border-top-width:1px; border-right:1px solid black">
			<p>$\textrm{G}$ major</p>
			</td>
			<td style="border-top-style:solid; text-align:left; border-top-color:black; border-top-width:1px; border-right:1px solid black">
			<p>$\textrm{G}$, $\textrm{A}$, $\textrm{B}$, $\textrm{C}$, $\textrm{D}$, $\textrm{E}$, and $\textrm{F}^{\sharp }$</p>
			</td>
			<td style="border-top-style:solid; text-align:left; border-top-color:black; border-top-width:1px; border-right:1px solid black">
			<p>$\textrm{F}^{\sharp }$ minor</p>
			</td>
			<td style="border-top-style:solid; border-top-color:black; border-top-width:1px; text-align:left">
			<p>$\textrm{F}^{\sharp }$, $\textrm{G}^{\sharp }$, $\textrm{A}$, $\textrm{B}$, $\textrm{C}^{\sharp }$, $\textrm{D}$, and $\textrm{E}$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:left; border-right:1px solid black">
			<p>$\textrm{C}$ major</p>
			</td>
			<td style="text-align:left; border-right:1px solid black">
			<p>$\textrm{C}$, $\textrm{D}$, $\textrm{E}$, $\textrm{F}$, $\textrm{G}$, $\textrm{A}$, and $\textrm{B}$</p>
			</td>
			<td style="text-align:left; border-right:1px solid black">
			<p>$\textrm{G}$ minor</p>
			</td>
			<td style="text-align:left">
			<p>$\textrm{G}$, $\textrm{A}$, $\textrm{B}^{\flat }$, $\textrm{C}$, $\textrm{D}$, $\textrm{E}^{\flat }$, and $\textrm{F}$</p>
			</td>
		</tr>
		<tr>
			<td style="text-align:left; border-right:1px solid black">
			<p>$\textrm{E}^{\flat }$ major</p>
			</td>
			<td style="text-align:left; border-right:1px solid black">
			<p>$\textrm{E}^{\flat }$, $\textrm{F}$, $\textrm{G}$, $\textrm{A}^{\flat }$, $\textrm{B}^{\flat }$, $\textrm{C}$, and $\textrm{D}$</p>
			</td>
		</tr>
	</tbody>
</table>
</center>
</div>

### 입력

<p>The first line of input contains a single integer $1 \leq N \leq 100\, 000$, the number of frequencies in the song. The next $N$ lines each contain a real number $20 \le f \le 4\, 000$, representing one pitch frequency, with at most $8$ digits after the decimal point. You may assume that the song was played using an instrument that is in tune, so that each frequency represents a valid pitch: each frequency approximates $440\cdot 2^{a/12}$ for some integer $a$ with absolute error at most $10^{-4}$.</p>

### 출력

<p>On the first line, output the name of the key that the song was played in: <code>G major</code>, <code>F# minor</code>, etc. See below for instructions for how to format pitch names. If the song does not fit any of the keys in Table 2, or if multiple possible keys could fit the song, print <code>cannot determine key</code>.</p>

<p>If the key could not be determined, print no further output. Otherwise, print $N$ lines, each containing one pitch name (in the order of the input sequence). Each pitch name should be a letter <code>A</code> through <code>G</code> followed optionally by a second character, either <code>#</code> or <code>b</code>, indicating a sharp or flat. Note that although pitches can have multiple names, only one of these names is listed in the allowed-pitches table for any given key, and this is the name you should use. For example, print <code>C#</code>, and not <code>Db</code>, when writing pitches for the key $\textrm{F}^{\sharp }$ minor.</p>