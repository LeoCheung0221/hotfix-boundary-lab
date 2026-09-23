# hotfix-boundary-lab

[![Android](https://img.shields.io/badge/platform-Android-3DDC84?logo=android)]()

**Education-only** matrix: *which kinds of changes hotfix/patch systems can and cannot apply* — without shipping a patch CDN or bypassing store policy.

Staff engineers get asked: “Can we hotfix this layout bug tonight?” The responsible answer depends on **class loaders, DEX layout, resources, native code, and manifest reality** — not vendor marketing slides.

---

## What runs in the app

On launch, the app renders **`PatchBoundaryCatalog`**: six rows (method body, new method, layout XML, new `R.id`, native `.so`, Application rename) each with **typical outcome** and **why**.

Baseline marker: `Greeting.version()` → `baseline-1.0` (placeholder for future debug-only patch exercises).

---

## How to use this in a design review

1. Classify the proposed fix into one row of the matrix.
2. If the row says **No** or **Risky**, plan **store release** or **server-side mitigation**.
3. Document **residual risk** (signature, multi-dex, OEM ROM) in the ticket.

Full implementation references belong in **private** security-reviewed codebases — not in a public drop-in patch loader.

---

## Safety

- **Do not** use this repo to distribute patches to end users.
- **Do not** use for tampering with third-party APKs.
- Debug education and internal training only.

---

## Related

| Repo | Topic |
|------|--------|
| [module-router-mechanism-notes](https://github.com/LeoCheung0221/module-router-mechanism-notes) | Compile-time wiring |
| [android-startup-trace](https://github.com/LeoCheung0221/android-startup-trace) | Launch / class loading order |

MIT License.
