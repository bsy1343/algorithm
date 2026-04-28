# [Gold V] Bale Figures - 27052

[문제 링크](https://www.acmicpc.net/problem/27052)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 12, 정답 비율: 85.714%

### 분류

애드 혹, 자료 구조, 해시를 사용한 집합과 맵, 구현, 시뮬레이션, 집합과 맵

### 문제 설명

<p>Cows like to build shapes out of hay bales. Each new shape is constructed from N (1 &le; N &le; 25,000) 1 x 1 x 1 cubic bales.</p>

<p>Bale 1 lies on the floor. After placing it, each successive bale from 2 through N is attached to the shape by placing the new bale in the proper relative position to one of the bales already placed. For instance, imagine the following figure:</p>

<ul>
	<li>Bale 1 - on the floor</li>
	<li>Bale 2 - RIGHT Bale 1 (to Bale 1&#39;s right)</li>
	<li>Bale 3 - FRONT Bale 2 (in front of Bale 2)</li>
	<li>Bale 4 - FRONT Bale 3</li>
</ul>

<p>This results in an (inverted) L-shape:</p>

<pre>
                     +--+--+                      
                1-&gt; /  /  /| &lt;-2                      
                   +--+--+ +
                   | /  /|/                         
                   ++--+ +                       
                   /  /|/ &lt;-3                     
                  +--+ +                          
                  |  |/ &lt;-4                       
                  +--+                            </pre>

<p>Adding another bale:</p>

<ul>
	<li>Bale 5 - OVER Bale 1</li>
</ul>

<p>adds height to the shape:</p>

<pre>
                     +--+                            
                    /  /|                           
                   +--+ +--+                      
               5-&gt; |  |/  /| &lt;-2                      
                   +--+--+ +
               1-&gt; | /  /|/                         
                   ++--+ +                       
                   /  /|/ &lt;-3                     
                  +--+ +                          
                  |  |/ &lt;-4                       
                  +--+                            </pre>

<p>But adding another directive:</p>

<ul>
	<li>Bale 6 - BACK Bale 4</li>
</ul>

<p>results in an invalid shape, since bales 3 and 6 would overlap.</p>

<p>Given N bales and placements described as above, output the exposed surface area of the solid figure if the shape is valid. A face is considered exposed if it is not touched by any face of any other bale and does not touch the floor (i.e., is not the bottom of a cube on the floor). Output -1 if the shape is invalid. No bale will be placed farther than 25 bale-widths from the first bale. No bale will be placed below the floor level.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N: These lines describe the placement of bales 2..N in the form &quot;j X&quot;. Line 2 describes bale 2; line 3 describes bale 3; and so on. The letter &quot;X&quot; is one of: &quot;L&quot; (left), &quot;R&quot; (right), &quot;F&quot; (front), &quot;B&quot; (back), &quot;O&quot; (over), or &quot;U&quot; (under). The bales can be glued and require no underlying support if extended over an empty space.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The exposed surface area of the resulting solid. If the solid is invalid, output &quot;-1&quot;.</li>
</ul>